package com.loan.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.loan.models.LoanAcceptance;
@Component
public class ManagerServiceDaoImpl implements ManagerServiceDao {
	@Autowired
	SessionFactory sessionfactory;

	public boolean approveLoan(LoanAcceptance loanAcceptance, int borrowerId) {
		// TODO Auto-generated method stub
		return false;
	}

	public LoanAcceptance searchLoan(String loanNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	public LoanAcceptance getLoan(String loanNumber) {
		// TODO Auto-generated method stub
		return null;
	}

}
