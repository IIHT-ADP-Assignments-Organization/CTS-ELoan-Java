package com.loan.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.loan.models.User;
@Component
public class AdminServiceDaoImpl implements AdminServiceDao {
	@Autowired
	SessionFactory sessionfactory;

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
