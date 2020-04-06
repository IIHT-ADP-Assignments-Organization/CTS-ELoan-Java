package com.loan.models;

public class LoanRePayment {
int loanNumber;
double amountRepaid;
String modeOfRepayment;
String chequeNumber;
public int getLoanNumber() {
	return loanNumber;
}
public void setLoanNumber(int loanNumber) {
	this.loanNumber = loanNumber;
}
public double getAmountRepaid() {
	return amountRepaid;
}
public void setAmountRepaid(double amountRepaid) {
	this.amountRepaid = amountRepaid;
}
public String getModeOfRepayment() {
	return modeOfRepayment;
}
public void setModeOfRepayment(String modeOfRepayment) {
	this.modeOfRepayment = modeOfRepayment;
}
public String getChequeNumber() {
	return chequeNumber;
}
public void setChequeNumber(String chequeNumber) {
	this.chequeNumber = chequeNumber;
}



}
