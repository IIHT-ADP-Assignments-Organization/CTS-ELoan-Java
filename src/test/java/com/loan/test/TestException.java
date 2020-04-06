package com.loan.test;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.loan.common.UserAlreadyExistException;
import com.loan.common.UserDoesNotExistException;
import com.loan.models.User;
import com.loan.services.AdminService;

import junit.framework.Assert;

public class TestException {
	@Test
    public void testForUserRegistration() throws UserAlreadyExistException 
    {
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("eloan-application.xml");
	 User user=new User();
	   user.setUserId(2);
	   user.setUserName("john");
	   user.setRole("admin");
	   user.setPassword("hello@1234");
	   user.setRetypePassword("hello@1234");

	 AdminService adminservice = (AdminService) context.getBean("AdminService");
	 adminservice.register(user);
Assert.assertEquals(UserAlreadyExistException.message," user already exists !..please login");
    }
	
	@Test
    public void testForUserLogin() throws UserDoesNotExistException  
    {
		
	 ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("eloan-application.xml");
	 User user=new User();
	   user.setUserId(2);
	   user.setUserName("john");
	   user.setRole("admin");
	   user.setPassword("hello@1234");
	   user.setRetypePassword("hello@1234");

     	
	   AdminService adminservice = (AdminService) context.getBean("AdminService");
	   adminservice.login(user.getUserName(),user.getPassword());
Assert.assertEquals(UserDoesNotExistException.message," user does not exists !..please register");
     }
}
