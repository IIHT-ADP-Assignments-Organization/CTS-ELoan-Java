package com.loan.services;

import com.loan.models.Loan;
import com.loan.models.LoanRePayment;

public interface LoanClerkService {
	
boolean newLoanApplication(Loan loan);
boolean repaymentRecieved(LoanRePayment loanrepayment,int borrowerId);
Loan searchLoan(int borrowerId);
Loan getLoan(int borrowerId);

}
