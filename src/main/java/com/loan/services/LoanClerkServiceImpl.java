package com.loan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.loan.dao.LoanClerkServiceDao;
import com.loan.models.Loan;
import com.loan.models.LoanRePayment;
@Component
public class LoanClerkServiceImpl implements LoanClerkService {
	@Autowired
	LoanClerkServiceDao clerkservicedao;

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
