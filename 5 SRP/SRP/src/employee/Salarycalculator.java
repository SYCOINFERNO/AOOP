package employee;

public class Salarycalculator {
	  public double calculateSalary(Employees employee) {
	        String role = employee.getRole();
	        double salary = 0;

	        switch (role) {
	            case "Developer":
	                salary = 80000;
	                break;
	            case "Manager":
	                salary = 120000;
	                break;
	            case "Intern":
	                salary = 30000;
	                break;
	            default:
	                salary = 50000;
	                break;
	        }
	        return salary;
	    }

}
