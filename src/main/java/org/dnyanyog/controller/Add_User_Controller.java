package org.dnyanyog.controller; 
import org.dnyanyog.dto.Add_User_Request;
import org.dnyanyog.dto.Add_User_Response;
import org.dnyanyog.service.Add_User_Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Add_User_Controller {

	@PostMapping("/adduser")
	public Add_User_Response AddUserRequest(@RequestBody Add_User_Request AddUserRequest) throws Exception {

		return new Add_User_Service().AddUserRequest(AddUserRequest);
	}

}
