package com.loan.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.loan.models.Borrowers;
import com.loan.models.Loan;
import com.loan.models.LoanAcceptance;
import com.loan.models.LoanRePayment;
import com.loan.models.User;
import com.loan.services.AdminService;
import com.loan.services.LoanClerkService;
import com.loan.services.ManagerService;



public class TestFunctional {
	
	@Test
	public void testvalidregistration() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("eloan-application.xml");
   User user=new User();
   user.setUserId(2);
   user.setUserName("john");
   user.setRole("admin");
   user.setPassword("hello@1234");
   user.setRetypePassword("hello@1234");
String isRegistered=(user.getUserName());
	

	AdminService adminservice=(AdminService) context.getBean("AdminService");
	boolean registration =adminservice.register(user);
	assertEquals(isRegistered,registration);
}
	@Test
	public void tesForValidLogin() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("eloan-application.xml");
	User user=new User();
	   user.setUserId(2);
	   user.setUserName("john");
	   user.setRole("admin");
	   user.setPassword("hello@1234");
	   user.setRetypePassword("hello@1234");
	    AdminService adminservice=(AdminService) context.getBean("AdminService");
	boolean userdetailsfromdb=adminservice.login(user.getUserName(), user.getPassword());
	assertEquals(true,userdetailsfromdb);
}
	@Test
	public void tesForValidDeleteUser() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("eloan-application.xml");
	User user=new User();
	   user.setUserId(2);
	   user.setUserName("john");
	   user.setRole("admin");
	   user.setPassword("hello@1234");
	   user.setRetypePassword("hello@1234");
	    AdminService adminservice=(AdminService) context.getBean("AdminService");
	boolean deleted=adminservice.deleteUser(user.getUserId());
	assertEquals(true,deleted);
}

	@Test
	public void tesForValidChangePassword() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("eloan-application.xml");
	User user=new User();
	   user.setUserId(2);
	   user.setUserName("john");
	   user.setRole("admin");
	   user.setPassword("hello@1234");
	   user.setRetypePassword("hello@1234");
	   AdminService adminservice=(AdminService) context.getBean("AdminService");
	boolean changed=adminservice.changePassword(user.getUserName(),user.getPassword(),user.getRetypePassword());
	assertEquals(true,changed);
}
	
	@Test
	public void tesForLoanRepaymentRecieved() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("eloan-application.xml");
	Borrowers b=new Borrowers();
	b.setBorrowerId(12);
	LoanRePayment lr=new LoanRePayment();
	lr.setAmountRepaid(10000.00);
	lr.setChequeNumber("12345");
lr.setLoanNumber(123);
	lr.setModeOfRepayment("online");
		
			
	   LoanClerkService clerkservice=(LoanClerkService) context.getBean("LoanClerkService");
	boolean payed=clerkservice.repaymentRecieved(lr, b.getBorrowerId());
	assertEquals(true,payed);
}
	@Test
	public void tesForNewApplication() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("eloan-application.xml");
	Loan loan=new Loan();
	loan.setLoanId(120);
	loan.setLoanAmountRequested(50000);
	loan.setLoanName("homeLoan");
	loan.setPropertyId(12);		
	   LoanClerkService clerkservice=(LoanClerkService) context.getBean("LoanClerkService");
	boolean applied=clerkservice.newLoanApplication(loan);
	assertEquals(true,applied);
}
	@Test
	public void tesForSearchLoan() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("eloan-application.xml");
	Borrowers b=new Borrowers();
	b.setBorrowerId(1234);
	   LoanClerkService clerkservice=(LoanClerkService) context.getBean("LoanClerkService");
	Loan applied=clerkservice.searchLoan(b.getBorrowerId());
	assertNotNull(applied);
}
	@Test
	public void tesForApproveLoan() {
	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("eloan-application.xml");
	Borrowers b=new Borrowers();
	b.setBorrowerId(1234);
	LoanAcceptance la=new LoanAcceptance();
	la.setLoanId(123);
		la.setPropertyId(120);
	la.setRegionalOffice("banglore");
	la.setSanctioningofficer("manager");
	   ManagerService managerservice=(ManagerService) context.getBean("ManagerService");
	boolean applied=managerservice.approveLoan(la, b.getBorrowerId());
	assertEquals(true,applied);
}
	
	
}
