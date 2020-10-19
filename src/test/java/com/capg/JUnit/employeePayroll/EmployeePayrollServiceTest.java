package com.capg.JUnit.employeePayroll;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

import com.capg.JUnit.employeePayroll.EmployeePayrollService.IOService;

public class EmployeePayrollServiceTest {
	@Test
	public void given3Employees_WhenWrittenToFile_ShouldMatchEmployeeEntries() {
		EmployeePayrollData[] arrayOfEmps = {new EmployeePayrollData(1, "Nishant", 100000.0),
				new EmployeePayrollData(2, "Chauhan", 105000.0),
				new EmployeePayrollData(3, "Singh", 100500.0)};
		EmployeePayrollService employeePayrollService;
		employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
		employeePayrollService.writeEmployeePayrollData(IOService.FILE_IO);
		long entries = employeePayrollService.countEntries(IOService.FILE_IO);
		Assert.assertEquals(3, entries);
	}
}

@Test
public void given3Employees_WhenPrinted_ShouldMatchEmployeeEntries() {
	EmployeePayrollData[] arrayOfEmps = {new EmployeePayrollData(1, "Nishant", 105000.0),
			new EmployeePayrollData(2, "Singh", 155000.0),
			new EmployeePayrollData(3, "Chauhan", 105500.0)};
	EmployeePayrollService employeePayrollService;
	employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
	employeePayrollService.writeEmployeePayrollData(IOService.FILE_IO);
	employeePayrollService.printEntries(IOService.FILE_IO);
	long entries = employeePayrollService.countEntries(IOService.FILE_IO);
	Assert.assertEquals(3, entries);
	log.info("No of employees in the payroll are : " + entries);
	
}
