package com.loan.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.loan.models.Loan;
import com.loan.models.LoanRePayment;
@Component
public class LoanClerkServicedaoImpl implements LoanClerkServiceDao {
	@Autowired
	SessionFactory sessionfactory;

	public boolean newLoanApplication(Loan loan) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean repaymentRecieved(LoanRePayment loanrepayment, int borrowerId) {
		// TODO Auto-generated method stub
		return false;
	}

	public Loan searchLoan(int borrowerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Loan getLoan(int borrowerId) {
		// TODO Auto-generated method stub
		return null;
	}

}
