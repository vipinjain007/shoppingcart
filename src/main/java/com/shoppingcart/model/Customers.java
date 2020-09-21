/**
 * 
 */
package com.shoppingcart.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vipin
  Sep 22, 2020 : 12:21:18 AM
 *
 */
public class Customers {
	List<CustomerTypes> customerTypes=new ArrayList<>();

	public List<CustomerTypes> getCustomerTypes() {
		return customerTypes;
	}

	public void setCustomerTypes(List<CustomerTypes> customerTypes) {
		this.customerTypes = customerTypes;
	}
}
