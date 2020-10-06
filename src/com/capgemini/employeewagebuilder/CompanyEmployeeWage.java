package com.capgemini.employeewagebuilder;

public class CompanyEmployeeWage {
	public final String compnyName;
	public final int noOfWorkDays;
	public final int maxWorkHrs;
	public final int ratePerHr;
	public int totalEmpWage;

	public CompanyEmployeeWage(String compnyName, int noOfWorkDays, int maxWorkHrs, int ratePerHr) {
		this.compnyName = compnyName;
		this.noOfWorkDays = noOfWorkDays;
		this.maxWorkHrs = maxWorkHrs;
		this.ratePerHr = ratePerHr;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;

	}

	public int getTotalEmpWage() {
		return (totalEmpWage);

	}

}
