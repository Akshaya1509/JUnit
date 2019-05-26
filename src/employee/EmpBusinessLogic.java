package employee;

public class EmpBusinessLogic {
	   // Calculate the yearly salary of employee
	   public Double calculateYearlySalary(EmployeeDetails employeeDetails) {
	      Double yearlySalary = new Double(0);
	      yearlySalary = employeeDetails.getMonthlySalary() * 12;
	      return yearlySalary;
	   }
		
	   // Calculate the appraisal amount of employee
	   public Double calculateAppraisal(EmployeeDetails employeeDetails) {
	      Double appraisal = new Double(0);
	      if(employeeDetails.getMonthlySalary() < 10000) {
	         appraisal = (double) 500;
	      } else{
	         appraisal = (double) 1000;
	      }
	      return appraisal;
	   }
	}