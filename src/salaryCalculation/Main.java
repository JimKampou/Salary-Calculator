package salaryCalculation;

//Program that calculates the salary of given employees, and studies the inheritance between classes

public class Main {

	public static void main(String[] args) {

		// Creating an array of employee objects, with different types of employees
		// (paid by the hour, on commission and fixed salary)

		Employee employees[] = new Employee[4];

		employees[0] = new HourlyEmployee(1, "Jim", "Halpert", 52, 25.99);
		employees[1] = new SalariedEmployee(2, "Pam", "Beesly", 3000);
		employees[2] = new CommissionEmployee(3, "Michael", "Scott", 0.08, 2000, 85000);
		employees[3] = new CommissionEmployee(4, "Oscar", "Martinez", 0.02, 1400, 62000);

		// For loop in array, and toString method, to display employees and salaries

		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
			System.out.println("\n");
		}
	}

}
