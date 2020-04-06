package com.loan.dao;

import com.loan.models.User;

public interface AdminServiceDao {
	boolean register(User user);
	boolean login(String userName,String password);
	boolean deleteUser(int userId);
	boolean changePassword(String userName,String password,String retypePassword);

}
