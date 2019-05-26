package employee.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import employee.EmpBusinessLogic;
import employee.EmployeeDetails;

public class EmpBusinessLogicTest {
	static EmployeeDetails empDetails =  new EmployeeDetails();
	static EmployeeDetails empDetails2 =  new EmployeeDetails();
	static EmpBusinessLogic empBusLogic = new EmpBusinessLogic();
	
	@BeforeClass
	public static void setUp() {
		empDetails.setMonthlySalary(1000);
		empDetails2.setMonthlySalary(20000);
	}
	
	@Test
	public void testCalculateYearlySalary() {
		assertEquals(new Double(12000), empBusLogic.calculateYearlySalary(empDetails));
	}
	
	@Test
	public void testCalculateAppraisal() {
		assertEquals(new Double(500), empBusLogic.calculateAppraisal(empDetails));
		assertEquals(new Double(1000), empBusLogic.calculateAppraisal(empDetails2));
	}
}
