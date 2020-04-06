package com.loan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.loan.dao.AdminServiceDao;
import com.loan.models.User;
@Component
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminServiceDao adminserviceDao;

	public boolean register(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteUser(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean changePassword(String userName, String password, String retypePassword) {
		// TODO Auto-generated method stub
		return false;
	}

}
