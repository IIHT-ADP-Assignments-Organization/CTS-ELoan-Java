package com.loan.services;

import com.loan.models.User;

public interface AdminService {
	
boolean register(User user);
boolean login(String userName,String password);
boolean deleteUser(int userId);
boolean changePassword(String userName,String password,String retypePassword);

}
