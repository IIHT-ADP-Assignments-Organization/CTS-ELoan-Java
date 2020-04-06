package com.loan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.loan.dao.ManagerServiceDao;
import com.loan.models.LoanAcceptance;
@Component
public class ManagerServiceImpl implements ManagerService {
	@Autowired
	ManagerServiceDao managerserviceDao;

	public boolean approveLoan(LoanAcceptance loanAcceptance, int borrowerId) {
		// TODO Auto-generated method stub
		return false;
	}

	public LoanAcceptance searchLoan(int loanNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public LoanAcceptance getLoan(int loanNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
