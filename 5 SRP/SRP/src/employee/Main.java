package employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Employees emp1 = new Employees("Alice", "Developer");
	        Employees emp2 = new Employees("Bob", "Manager");
	        Employees emp3 = new Employees("Charlie", "Intern");

	        Salarycalculator salaryCalculator = new Salarycalculator();

	        System.out.println(emp1.getName() + " earns $" + salaryCalculator.calculateSalary(emp1));
	        System.out.println(emp2.getName() + " earns $" + salaryCalculator.calculateSalary(emp2));
	        System.out.println(emp3.getName() + " earns $" + salaryCalculator.calculateSalary(emp3));
	    

	}

}
