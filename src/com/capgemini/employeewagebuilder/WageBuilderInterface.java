package com.capgemini.employeewagebuilder;

public interface WageBuilderInterface {
	public void wageComputation();

	public int wageComputation(CompanyEmployeeWage CompanyEmployeeWage);

	public void addCompanyEmployeeWage(String compnyName, int noOfWorkDays, int maxWorkHrs, int ratePerHr);
}