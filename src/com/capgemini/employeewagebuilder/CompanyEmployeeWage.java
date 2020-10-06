package com.capgemini.employeewagebuilder;

import java.util.*;

public class CompanyEmployeeWage {
	public final String compnyName;
	public final int noOfWorkDays;
	public final int maxWorkHrs;
	public final int ratePerHr;
	public int totalEmpWage;
	public HashMap<Integer, Integer> dailyWage;

	public CompanyEmployeeWage(String compnyName, int noOfWorkDays, int maxWorkHrs, int ratePerHr) {
		this.compnyName = compnyName;
		this.noOfWorkDays = noOfWorkDays;
		this.maxWorkHrs = maxWorkHrs;
		this.ratePerHr = ratePerHr;
	}

	public String getCompanyName() {
		return (compnyName);

	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;

	}

	public void setDailyEmpWage(HashMap<Integer, Integer> dailyWage) {
		this.dailyWage = dailyWage;

	}

	public HashMap<Integer, Integer> getDailyEmpWage() {
		return (dailyWage);

	}

	public int getTotalEmpWage() {
		return (totalEmpWage);

	}

}