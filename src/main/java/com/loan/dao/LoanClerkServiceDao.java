package com.loan.dao;

import com.loan.models.Loan;
import com.loan.models.LoanRePayment;

public interface LoanClerkServiceDao {
	boolean newLoanApplication(Loan loan);
	boolean repaymentRecieved(LoanRePayment loanrepayment,int borrowerId);
	Loan searchLoan(int borrowerId);
	Loan getLoan(int borrowerId);


}
