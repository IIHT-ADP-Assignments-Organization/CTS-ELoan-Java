package com.loan.models;

import java.util.Date;

public class LoanAmortization {
	
Date timesOfLoan;
Date repaymentStartDate;
Date loanClosureDate;
String interestRate;
double monthlyPaymentAmount;
public Date getTimesOfLoan() {
	return timesOfLoan;
}
public void setTimesOfLoan(Date timesOfLoan) {
	this.timesOfLoan = timesOfLoan;
}
public Date getRepaymentStartDate() {
	return repaymentStartDate;
}
public void setRepaymentStartDate(Date repaymentStartDate) {
	this.repaymentStartDate = repaymentStartDate;
}
public Date getLoanClosureDate() {
	return loanClosureDate;
}
public void setLoanClosureDate(Date loanClosureDate) {
	this.loanClosureDate = loanClosureDate;
}
public String getInterestRate() {
	return interestRate;
}
public void setInterestRate(String interestRate) {
	this.interestRate = interestRate;
}
public double getMonthlyPaymentAmount() {
	return monthlyPaymentAmount;
}
public void setMonthlyPaymentAmount(double monthlyPaymentAmount) {
	this.monthlyPaymentAmount = monthlyPaymentAmount;
}


}
