package org.koushik.javabrains.service;

import java.util.HashMap;

import org.koushik.javabrains.dto.User;

public class LoginService {
	
	HashMap<String, String> userNameMap = new HashMap<>();
	
	public LoginService() {
		userNameMap.put("john", "john name");
		userNameMap.put("mary", "marry name");
		userNameMap.put("harry", "harry name");
	}
	
	public boolean authenticate(String userId, String password) {
		//usually have JDBC connection to DB for validation, but for simplicity not doing so here
		if (password == null || password.isEmpty()) {
			return false;
		}
		return true;
	}
	
	public User getUserDetails(String userId) {
		User user = new User();
		user.setUserId(userId);
		user.setUserName(userNameMap.get(userId));
		return user;
	}
}
