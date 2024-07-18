package org.dnyanyog.service;

import org.dnyanyog.common.Dbutils;
import org.dnyanyog.dto.Add_User_Request;
import org.dnyanyog.dto.Add_User_Response;

public class Add_User_Service {

	public Add_User_Response AddUserRequest(Add_User_Request AddUserRequest) throws Exception {
		Add_User_Response response = new Add_User_Response();

		String resultAddUserRequest = " INSERT into userdetails(f_name, l_name , age  , gender , email , pass  )VALUES"
				+ "('" + AddUserRequest.f_name + "' , '" + AddUserRequest.l_name + "','" + AddUserRequest.age + "','"
				+ AddUserRequest.gender + "' , '" + AddUserRequest.email + "' ,'" + AddUserRequest.pass + "')";

		Dbutils.executeQuery(resultAddUserRequest);
		response.errorCode = "0000";
		response.message = "user added Sucessfully ";

		return response;

	}
}
