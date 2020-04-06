package com.loan.dao;

import com.loan.models.LoanAcceptance;

public interface ManagerServiceDao {
	boolean approveLoan(LoanAcceptance loanAcceptance,int borrowerId);
	LoanAcceptance searchLoan(String loanNumber);
	LoanAcceptance getLoan(String loanNumber);


}
