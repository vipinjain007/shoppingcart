/**
 * 
 */
package com.shoppingcart.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shoppingcart.model.CustomerTypes;
import com.shoppingcart.model.Customers;
import com.shoppingcart.model.DiscountSlab;

/**
 * @author vipin
  Sep 22, 2020 : 12:37:25 AM
 *
 */
public class CustomerDetailsService {
	
	public static Map<String,List<DiscountSlab>> getCustomerTypesWithDiscountSlabs() throws JsonParseException, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		File file = new File(getUrl().getFile());
		 Customers customers = mapper.readValue(file, Customers.class);
		 List<CustomerTypes>  custList=customers.getCustomerTypes();
		 Map<String, List<DiscountSlab>> customersDetalisMap = custList.stream().collect(
	                Collectors.toMap(CustomerTypes::getType, CustomerTypes::getDiscountSlabs));
		
		return customersDetalisMap;
		
		
	}
   
	private static URL getUrl() throws FileNotFoundException {
		   URL resource = null;
			
			try {
				ClassLoader classLoader = ClassLoader.getSystemClassLoader();
				resource = classLoader.getResource("Json/customerTypesAndSlab.json");
			}catch (Exception e) {
				throw new FileNotFoundException("ERROR: file not found:customerTypesAndSlab.json");
			}
			return resource;
	   }
}
