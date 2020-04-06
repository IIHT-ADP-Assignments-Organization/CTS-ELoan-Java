package com.loan.models;

import java.util.Date;

public class LoanAcceptance {
int loanId;
int loanNumber;
String regionalOffice;
Date sanctionedDate;
String sanctioningofficer;
int propertyId;
public int getLoanId() {
	return loanId;
}
public void setLoanId(int loanId) {
	this.loanId = loanId;
}
public int getLoanNumber() {
	return loanNumber;
}
public void setLoanNumber(int loanNumber) {
	this.loanNumber = loanNumber;
}
public String getRegionalOffice() {
	return regionalOffice;
}
public void setRegionalOffice(String regionalOffice) {
	this.regionalOffice = regionalOffice;
}
public Date getSanctionedDate() {
	return sanctionedDate;
}
public void setSanctionedDate(Date sanctionedDate) {
	this.sanctionedDate = sanctionedDate;
}
public String getSanctioningofficer() {
	return sanctioningofficer;
}
public void setSanctioningofficer(String sanctioningofficer) {
	this.sanctioningofficer = sanctioningofficer;
}
public int getPropertyId() {
	return propertyId;
}
public void setPropertyId(int propertyId) {
	this.propertyId = propertyId;
}

}
