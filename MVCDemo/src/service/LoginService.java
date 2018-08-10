package service;

import bean.Login;

public class LoginService {

	
	public String checkUser(Login ll) {
		if(ll.getUser().equals("Raj") && ll.getPass().equals("123")) {
			return "success";
		}else {
			return "failure";
		}
	}
}
