/**
 * 
 */
package com.shoppingcart.service;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.shoppingcart.exception.ShopingCartException;
import com.shoppingcart.model.DiscountSlab;

/**
 * @author vipin Sep 22, 2020 : 12:44:25 AM
 *
 */
public class DiscountGeneraterService {

	public double getBillAmount(String customerType, float purchaseAmount)
			throws JsonParseException, JsonMappingException, IOException, ShopingCartException {
		Map<String, List<DiscountSlab>> customersMap = CustomerDetailsService.getCustomerTypesWithDiscountSlabs();
		List<DiscountSlab> discountSlabs = customersMap.get(customerType);
		Map<String, Double> discountAmount = new HashMap<>();
		discountAmount.put("discountAmount", 0.0);
		if (discountSlabs.isEmpty()) {
			throw new ShopingCartException(
					"This Customer Type dont have discount slab so please add  the same in json");
		} else {
			discountSlabs.forEach(ds -> {
				if (ds.getRangeMin() < purchaseAmount && ds.getRangeMax() >= purchaseAmount) {

					getDiscountAmount(purchaseAmount, discountAmount, ds);
				} else if (ds.getRangeMax() < purchaseAmount && ds.getRangeMax() > 0.0) {
					if (ds.getDiscPerc() > 0) {
						float amount = ds.getRangeMax() - ds.getRangeMin();
						discountAmount.put("discountAmount",
								discountAmount.get("discountAmount") + ds.getDiscPerc() * (amount / 100));
					}

				} else if (ds.getRangeMin() < purchaseAmount && ds.getRangeMax() == 0.0) {
					getDiscountAmount(purchaseAmount, discountAmount, ds);
				}
			});
		}

		return (purchaseAmount - discountAmount.get("discountAmount"));
	}

	/**
	 * @param purchaseAmount
	 * @param discountAmount
	 * @param ds
	 */
	private void getDiscountAmount(float purchaseAmount, Map<String, Double> discountAmount, DiscountSlab ds) {
		if (ds.getDiscPerc() > 0) {
			float amount = purchaseAmount - ds.getRangeMin();
			discountAmount.put("discountAmount",
					discountAmount.get("discountAmount") + ds.getDiscPerc() * (amount / 100));

		}
	}

}
