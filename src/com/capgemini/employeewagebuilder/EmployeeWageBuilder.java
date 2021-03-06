package com.capgemini.employeewagebuilder;

import java.util.*;

public class EmployeeWageBuilder implements WageBuilderInterface {

	private static int companyCount = 0;
	private static ArrayList<CompanyEmployeeWage> EmployeeWageList;
	private static HashMap<Integer, Integer> dailyWage = new HashMap<>();
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;

	public EmployeeWageBuilder() {
		EmployeeWageList = new ArrayList<CompanyEmployeeWage>();
	}

	public void addCompanyEmployeeWage(String compnyName, int noOfWorkDays, int maxWorkHrs, int ratePerHr) {
		EmployeeWageList.add(new CompanyEmployeeWage(compnyName, noOfWorkDays, maxWorkHrs, ratePerHr));
		companyCount += 1;
	}

	public void getTotalWageOfAll() {
		for (int i = 0; i < companyCount; i++) {
			System.out.println("Comapany Name : " + EmployeeWageList.get(i).getCompanyName()
					+ ", Total Employee Wage : " + EmployeeWageList.get(i).getTotalEmpWage());
		}
	}

	public void wageComputation() {
		for (int i = 0; i < companyCount; i++) {
			EmployeeWageList.get(i).setTotalEmpWage(this.wageComputation(EmployeeWageList.get(i)));
			EmployeeWageList.get(i).setDailyEmpWage(dailyWage);
			dailyWage.clear();
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
			dailyWage.put(days, wage);
			totalEmpWage = totalEmpWage + wage;
			System.out.println("Employee wage on day " + days + " is : " + wage);
		}
		System.out.println("Total Hours : " + totalHrs);
		System.out.println("Total Days : " + days);
		return totalEmpWage;
	}

	public static void main(String[] args) {
		EmployeeWageBuilder wageBuilderObject = new EmployeeWageBuilder();
		wageBuilderObject.addCompanyEmployeeWage("Capgemini", 20, 100, 20);
		wageBuilderObject.addCompanyEmployeeWage("IBM", 18, 110, 25);
		wageBuilderObject.wageComputation();
		wageBuilderObject.getTotalWageOfAll();
	}
}