package com.capgemini.employeewagebuilder;

public class EmployeeWageBuilder {

	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int noOfWorkDays = 20;

	public static void main(String[] args) {

		final int RATE_PER_HR = 20;
		int noOfHrs = 0;
		int wage = 0;
		int totalEmpWage = 0;

		for (int d = 0; d < noOfWorkDays; d++) {
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
			wage = noOfHrs * RATE_PER_HR;
			totalEmpWage = totalEmpWage + wage;
			System.out.println("Employee wage is : " + wage);
		}
		System.out.println("Total Employee wage is : " + totalEmpWage);
	}

}
