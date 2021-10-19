package salaryCalculation;

//Employee working on commission
public class CommissionEmployee extends Employee {

	private double commissionRate;
	private double baseSalary;
	private double totalSales;

	public CommissionEmployee() {
		super(); // Invoking immediate parent class (Employee) constructor.
	}

	public CommissionEmployee(int employeeId, String firstName, String lastName, double rate, double baseSalary,
			double totalSales) {
		super(employeeId, firstName, lastName); // From parent class
		commissionRate = rate;
		this.baseSalary = baseSalary;
		this.totalSales = totalSales;
	}

	// Getter Methods
	public double getCommissionRate() {
		return commissionRate;
	}

	public double getBaseSalary() {
		return this.baseSalary;
	}

	public double getSales() {
		return totalSales;
	}

	// Setter Methods
	public void setComssionRate(double rate) {
		this.commissionRate = rate;
	}

	public void setBaseSalary(double salary) {
		this.baseSalary = salary;
	}

	public void setSales(double sales) {
		this.totalSales = sales;
	}

	public double calculateCommssion() {
		return totalSales * commissionRate;
	}

	// Function to calculate salary of an employee -
	// All the child class must override this function

	public double calculateSalary() {
		return calculateCommssion() + baseSalary;
	}

	// =========================================================================================================================================
	@Override
	public String toString() {
		return super.toString() + String.format("%-20s %.2f%n", "Salary:", calculateSalary());
	}

}
