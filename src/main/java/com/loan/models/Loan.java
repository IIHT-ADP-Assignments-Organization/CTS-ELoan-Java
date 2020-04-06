package com.loan.models;

import java.util.Date;

public class Loan {
int loanId;
int borrowerId;
String loanName;
String loanApplicationNumber;
double loanAmountRequested;
Date loanApplicationDate;
int propertyId;
public int getLoanId() {
	return loanId;
}
public void setLoanId(int loanId) {
	this.loanId = loanId;
}
public int getBorrowerId() {
	return borrowerId;
}
public void setBorrowerId(int borrowerId) {
	this.borrowerId = borrowerId;
}
public String getLoanName() {
	return loanName;
}
public void setLoanName(String loanName) {
	this.loanName = loanName;
}
public String getLoanApplicationNumber() {
	return loanApplicationNumber;
}
public void setLoanApplicationNumber(String loanApplicationNumber) {
	this.loanApplicationNumber = loanApplicationNumber;
}
public double getLoanAmountRequested() {
	return loanAmountRequested;
}
public void setLoanAmountRequested(double loanAmountRequested) {
	this.loanAmountRequested = loanAmountRequested;
}
public Date getLoanApplicationDate() {
	return loanApplicationDate;
}
public void setLoanApplicationDate(Date loanApplicationDate) {
	this.loanApplicationDate = loanApplicationDate;
}
public int getPropertyId() {
	return propertyId;
}
public void setPropertyId(int propertyId) {
	this.propertyId = propertyId;
}

}
