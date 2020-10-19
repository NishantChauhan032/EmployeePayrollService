package com.capg.JUnit.employeePayroll;

public class EmployeePayrollData {
	public String name;
	public int id;
	public double salary;

	public EmployeePayrollData(int id, String name, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee ID = " + id + ", Employee Name = " + name + ", Salary = " + salary;
	}

}
