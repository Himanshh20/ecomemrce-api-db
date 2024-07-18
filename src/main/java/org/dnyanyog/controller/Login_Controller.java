package org.dnyanyog.controller;

import org.dnyanyog.dto.Login_Request;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Login_Controller { 
	 @PostMapping ("/login") 
	 public String login (@RequestBody Login_Request loginBody)  { 
		  System.out.println(loginBody) ;  
		  
		  return "sucessfull" ; 
		  
	 }



}
