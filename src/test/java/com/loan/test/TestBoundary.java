package com.loan.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import com.loan.models.Borrowers;
import com.loan.models.User;


public class TestBoundary {
	 @Test
	    public void validPassword()
	    {
	        User user=new User();
	        user.setPassword("hello@1234");
	        int passwordLength=10;
	assertEquals(passwordLength,user.getPassword().length());
	    }
	 
	 @Test
	    public void validEmail()
	    {
		 Borrowers borrower=new Borrowers();
		 borrower.setEmail("sample@gmail.com");
	        
	    boolean contains=borrower.getEmail().isEmpty();
	        assertEquals(false,contains);
	    }
	 @Test
	    public void validName()
	    {
		 User user=new User();
		 user.setUserName("james");
		 
	        int min=2;
	        boolean name=user.getUserName().length()>min;
	        assertEquals(true,name);
	    }
	 
	 @Test
	    public void validPhoneNumber()
	    {
		 Borrowers borrower=new Borrowers();
		 borrower.setPhoneNumber(1234567890);
	        int phoneNumberLength=10;
	        
	        
	        int getLengthOfNumber=(Integer.toString(borrower.getPhoneNumber()).length());
	assertEquals( phoneNumberLength, getLengthOfNumber);
	    }
	 
}
