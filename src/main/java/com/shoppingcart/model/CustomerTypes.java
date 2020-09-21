/**
 * 
 */
package com.shoppingcart.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vipin
  Sep 21, 2020 : 11:19:49 PM
 *
 */
public class CustomerTypes {
	private long id;
    private String type;
    List<DiscountSlab> discountSlabs=new ArrayList<>();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<DiscountSlab> getDiscountSlabs() {
		return discountSlabs;
	}
	public void setDiscountSlabs(List<DiscountSlab> discountSlabs) {
		this.discountSlabs = discountSlabs;
	}
	
	

}
