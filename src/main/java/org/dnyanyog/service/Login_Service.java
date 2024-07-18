package org.dnyanyog.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.dnyanyog.common.Dbutils;
import org.dnyanyog.dto.Login_Request;
import org.dnyanyog.dto.Login_Response;

public class Login_Service { 

		 public Login_Response  loginbody (  Login_Request loginBody) throws SQLException {   
			 Login_Response response = new Login_Response (); 
			  String query = "SELECT * FROM ecomerse.login  WHERE username ='"+loginBody.user+"' AND password = '"+loginBody.password+"'" ; 


	 		  ResultSet resultset =  Dbutils.executeSelectQuery(query);  
         response.errorCode = "0000" ; 
         response.message="login Sucessfull " ; 
        return response ; 
 
				}
		
			  
		      }


