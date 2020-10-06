package com.capgemini.employeewagebuilder;

public class EmployeeWageBuilder {
	public static void main(String[] args) {
		final int IS_FULL_TIME = 1;
		final int RATE_PER_HR = 20;
		int noOfHrs = 0;
		int wage = 0;
		double employeeCheck = Math.floor(Math.random() * 10) % 2;
		if (employeeCheck == IS_FULL_TIME) {
			noOfHrs = 8;
		}

		else {
			noOfHrs = 0;
		}

		wage = noOfHrs * RATE_PER_HR;
		System.out.println("Employee wage is : " + wage);

	}

}
