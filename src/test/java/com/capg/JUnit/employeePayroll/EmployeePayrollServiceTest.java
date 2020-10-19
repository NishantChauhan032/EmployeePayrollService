package com.capg.JUnit.employeePayroll;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

import com.capg.JUnit.employeePayroll.EmployeePayrollService.IOService;

public class EmployeePayrollServiceTest {
	@Test
	public void given3Employees_WhenWrittenToFile_ShouldMatchEmployeeEntries() {
		EmployeePayrollData[] arrayOfEmps = {new EmployeePayrollData(1, "Nishant", 10000.0),
				new EmployeePayrollData(2, "Chauhan", 15000.0),
				new EmployeePayrollData(3, "Singh", 10500.0)};
		EmployeePayrollService employeePayrollService;
		employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
		employeePayrollService.writeEmployeePayrollData(IOService.FILE_IO);
		long entries = employeePayrollService.countEntries(IOService.FILE_IO);
		Assert.assertEquals(3, entries);
	}
}

