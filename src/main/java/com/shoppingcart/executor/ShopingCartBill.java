/**
 * 
 */
package com.shoppingcart.executor;

import com.shoppingcart.service.DiscountGeneraterService;

/**
 * @author vipin
  Sep 21, 2020 : 11:37:32 PM
 *
 */
public class ShopingCartBill {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 DiscountGeneraterService discountGeneraterService=new DiscountGeneraterService();
		 logBillDetails("Regular",5000f,discountGeneraterService);
		 logBillDetails("Regular",10000f,discountGeneraterService);
		 logBillDetails("Regular",15000f,discountGeneraterService);
		 logBillDetails("Premium",4000f,discountGeneraterService);
		 logBillDetails("Premium",8000f,discountGeneraterService);
		 logBillDetails("Premium",12000f,discountGeneraterService);
		 logBillDetails("Premium",20000f,discountGeneraterService);
			
		
		  
	}

	/**
	 * @param string
	 * @param f
	 */
	public static double logBillDetails(String type, float purchaseAmount,DiscountGeneraterService discountGeneraterService) {
		double billAmount=0.0;
		try {
			System.out.print("customerType ="+type +" purchaseAmount : $"+purchaseAmount +":");
			billAmount=discountGeneraterService.getBillAmount(type, purchaseAmount);
			System.out.println(" billAmount.."+billAmount);
			
		}catch(Exception e) {
			System.out.print(" Exception to get and logBillDetails :"+e.getMessage() );
		}
		return billAmount;
	}
   
}
