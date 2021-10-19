package salaryCalculation;

//Employee with fixed salary
public class SalariedEmployee extends Employee {
	private double baseSalary;

	public SalariedEmployee() {
		super();
	}

	public SalariedEmployee(int employeeId, String firstName, String lastName, double salary) {
		super(employeeId, firstName, lastName);
		baseSalary = salary;
	}

	public void setBaseSalary(double salary) {
		this.baseSalary = salary;
	}

	// Function to calculate salary of an employee - All the children classes must
	// override this function

	public double calculateSalary() {
		return baseSalary;
	}

	// =========================================================================================================================================

	@Override
	public String toString() {
		return super.toString() + String.format("%-20s %.2f%n", "Salary:", calculateSalary());
	}
}