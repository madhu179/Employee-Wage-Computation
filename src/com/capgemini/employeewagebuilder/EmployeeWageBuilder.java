package com.capgemini.employeewagebuilder;

public class EmployeeWageBuilder {

	private int companyCount = 0;
	private CompanyEmployeeWage[] EmployeeWageArray;

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public EmployeeWageBuilder() {
		EmployeeWageArray = new CompanyEmployeeWage[10];
	}

	public void addCompanyEmployeeWage(String compnyName, int noOfWorkDays, int maxWorkHrs, int ratePerHr) {
		EmployeeWageArray[companyCount] = new CompanyEmployeeWage(compnyName, noOfWorkDays, maxWorkHrs, ratePerHr);
		companyCount += 1;
	}

	public void wageComputation() {
		for (int i = 0; i < companyCount; i++) {
			EmployeeWageArray[i].setTotalEmpWage(this.wageComputation(EmployeeWageArray[i]));
		}
	}

	public int wageComputation(CompanyEmployeeWage CompanyEmployeeWage) {

		int noOfHrs = 0;
		int wage = 0;
		int totalEmpWage = 0;
		int totalHrs = 0;
		int days = 0;
		while (days < CompanyEmployeeWage.noOfWorkDays && totalHrs <= CompanyEmployeeWage.maxWorkHrs) {
			double employeeCheck = Math.floor(Math.random() * 10) % 3;

			switch ((int) employeeCheck) {
			case IS_FULL_TIME:
				noOfHrs = 8;
				break;
			case IS_PART_TIME:
				noOfHrs = 4;
				break;
			default:
				noOfHrs = 0;
				break;
			}
			totalHrs = totalHrs + noOfHrs;
			days = days + 1;
			wage = noOfHrs * CompanyEmployeeWage.ratePerHr;
			totalEmpWage = totalEmpWage + wage;
			System.out.println("Employee wage is : " + wage);
		}
		System.out.println("Total Hours : " + totalHrs);
		System.out.println("Total Days : " + days);
		System.out.println(
				"Total Employee wage for the Comapany " + CompanyEmployeeWage.compnyName + " is : " + totalEmpWage);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		EmployeeWageBuilder wageBuilderObject = new EmployeeWageBuilder();
		wageBuilderObject.addCompanyEmployeeWage("Capgemini", 20, 100, 20);
		wageBuilderObject.addCompanyEmployeeWage("IBM", 18, 110, 25);
		wageBuilderObject.wageComputation();
	}
}