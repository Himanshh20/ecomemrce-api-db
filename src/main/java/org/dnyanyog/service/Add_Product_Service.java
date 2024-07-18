package org.dnyanyog.service;

import org.dnyanyog.common.Dbutils;
import org.dnyanyog.dto.Add_Product_Request;
import org.dnyanyog.dto.Add_Product_Response;
import org.springframework.web.bind.annotation.RequestBody;


public class Add_Product_Service {  
	  public Add_Product_Response AddProductRequest ( @RequestBody Add_Product_Request addProductRequest) throws Exception {
		  Add_Product_Response response = new Add_Product_Response ();  
		 
					String resultAddProductRequest = " INSERT into EcommerceProduct(name, qunatity , price    )VALUES"
							+ "('" + addProductRequest.name + "' , '" + addProductRequest.quantity + "','" + addProductRequest.price + "')";

			Dbutils.executeQuery(resultAddProductRequest);
			response.errorCode = "0000";
			response.message = "Product added Sucessfully ";

			return response;

}
}
 