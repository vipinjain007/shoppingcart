/**
 * 
 */
package com.shoppingcart;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.shoppingcart.executor.ShopingCartBill;
import com.shoppingcart.service.DiscountGeneraterService;


/**
 * @author vipin
  Sep 22, 2020 : 3:31:25 AM
 *
 */
public class PremiumAndRegularCustomerTest {
private static ShopingCartBill shopingCartPremiumCustomer;
private DiscountGeneraterService discountGeneraterService;
private static final String PREMIUM_CUSTOMER_TYPE="Premium";
private static final String REGULAR_CUSTOMER_TYPE="Regular";


	
	@Before
	public void setup() {
		
		this.discountGeneraterService=new DiscountGeneraterService();
	}
	
	
	//Test Case 1 : Customer Type (input): Premium ,Purchase Amount (input) :$ 4,000 Bill Amount (output):$ 3,600

	@Test
	public  void testPremiumCustomerSlabBillAmount3600() {
	@SuppressWarnings("static-access")
	double	billAmount =shopingCartPremiumCustomer.logBillDetails(PREMIUM_CUSTOMER_TYPE, 4000f, discountGeneraterService);
	 assertEquals(3600.0, billAmount,0.0);
	}
	
	//Test Case 2 : Customer Type (input): Premium ,Purchase Amount (input) :$ 8000f Bill Amount (output):$ 7000
	
	@Test
	public  void testPremiumCustomerSlabBillAmount7000() {
	@SuppressWarnings("static-access")
	double	billAmount =shopingCartPremiumCustomer.logBillDetails(PREMIUM_CUSTOMER_TYPE, 8000f, discountGeneraterService);
	 assertEquals(7000.0, billAmount,0.0);
	}
	
	//Test Case 3 : Customer Type (input): Premium ,Purchase Amount (input) :$ 12000f Bill Amount (output):$ 10200	
	
	@Test
	public  void testPremiumCustomerSlabBillAmount10200() {
	@SuppressWarnings("static-access")
	double	billAmount =shopingCartPremiumCustomer.logBillDetails(PREMIUM_CUSTOMER_TYPE, 12000f, discountGeneraterService);
	 assertEquals(10200.0, billAmount,0.0);
	}
	
	//Test Case 4 : Customer Type (input): Premium ,Purchase Amount (input) :$ 20000f Bill Amount (output):$ 15800	
	@Test
	public  void testPremiumCustomerSlabBillAmountTest15800() {
	@SuppressWarnings("static-access")
	double	billAmount =shopingCartPremiumCustomer.logBillDetails(PREMIUM_CUSTOMER_TYPE, 20000f, discountGeneraterService);
	 assertEquals(15800.0, billAmount,0.0);
	}
	
	
	//Test Case 1 : Customer Type (input): Regular ,Purchase Amount (input) :$ $ 5,000  Bill Amount (output):$ $ 5,000 

	@Test
	public  void testRegularCustomerSlabBillAmount5000() {
	@SuppressWarnings("static-access")
	double	billAmount =shopingCartPremiumCustomer.logBillDetails(REGULAR_CUSTOMER_TYPE, 5000f, discountGeneraterService);
	 assertEquals(5000.0, billAmount,0.0);
	}
	

	//Test Case 2 : Customer Type (input): Regular ,Purchase Amount (input) :$ $ 10,000  Bill Amount (output):$ $ 9,500

	@Test
	public  void testRegularCustomerSlabBillAmount9500() {
	@SuppressWarnings("static-access")
	double	billAmount =shopingCartPremiumCustomer.logBillDetails(REGULAR_CUSTOMER_TYPE, 10000f, discountGeneraterService);
	 assertEquals(9500.0, billAmount,0.0);
	}
	

	//Test Case 2 : Customer Type (input): Regular ,Purchase Amount (input) :$ $ 15,000  Bill Amount (output):$ $ 13500

	@Test
	public  void testRegularCustomerSlabBillAmount13500() {
	@SuppressWarnings("static-access")
	double	billAmount =shopingCartPremiumCustomer.logBillDetails(REGULAR_CUSTOMER_TYPE, 15000f, discountGeneraterService);
	 assertEquals(13500.0, billAmount,0.0);
	}
}
