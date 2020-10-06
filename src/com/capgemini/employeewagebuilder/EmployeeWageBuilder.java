package com.capgemini.employeewagebuilder;

public class EmployeeWageBuilder {
	public static void main(String[] args) {
		final int PRESENT = 1;
		double employeeCheck = Math.floor(Math.random() * 10) % 2;
		if (employeeCheck == PRESENT) {
			System.out.println("Employee is present");
		}

		else {
			System.out.println("Employee is absent");
		}

	}

}
