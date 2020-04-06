package com.loan.models;

public class User {
int userId;
String userName;
String Password;
String retypePassword;
String role;
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	this.Password = password;
}
public String getRetypePassword() {
	return retypePassword;
}
public void setRetypePassword(String retypePassword) {
	this.retypePassword = retypePassword;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

}
