package org.dnyanyog.controller;

import org.dnyanyog.dto.Add_Product_Request;
import org.dnyanyog.dto.Add_Product_Response;
import org.dnyanyog.dto.Add_User_Request;
import org.dnyanyog.dto.Add_User_Response;
import org.dnyanyog.service.Add_Product_Service;
import org.dnyanyog.service.Add_User_Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController; 
 
 @RestController  
public class Add_Product_Controller {  
	@PostMapping("/addproduct")  
	public Add_Product_Response  AddProductRequest(@RequestBody Add_Product_Request  AddProductRequest) throws Exception {
		return new Add_Product_Service().AddProductRequest(AddProductRequest);

	}
 } 
 


 
