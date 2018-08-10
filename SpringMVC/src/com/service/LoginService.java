package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Login;
import com.dao.LoginDao;

@Service
public class LoginService {

	@Autowired
	LoginDao loginDao;
	
	public int storeLoginDetails(Login ll) {
		return loginDao.storeLoginDetails(ll);
	}
	
	public List<Login> getLoginDetails() {
		return loginDao.getLoginInfo();
	}
	
}
