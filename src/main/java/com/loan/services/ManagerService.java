package com.loan.services;

import com.loan.models.LoanAcceptance;

public interface ManagerService {
	
boolean approveLoan(LoanAcceptance loanAcceptance,int borrowerId);
LoanAcceptance searchLoan(int loanNumber);
LoanAcceptance getLoan(int loanNumber);

}
