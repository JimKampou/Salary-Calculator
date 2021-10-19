package salaryCalculation;

public abstract class Employee {

	// Class Fields
	private int employeeId;
	private String firstName;
	private String lastName;

	// Default constructor
	public Employee() {

	}

	public Employee(int employeeId, String firstName, String lastName) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	// Getter Methods
	public int getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLaString() {
		return lastName;
	}

	// Setter Methods
	public void setEmployeeId(int id) {
		this.employeeId = id;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public void setLastName(String name) {
		this.lastName = name;
	}

	// Function to calculate salary of an employee - All the child class must
	// override this function

	public abstract double calculateSalary();

	// =======================================================================================================================================
	@Override
	public String toString() {
		// Positioning the result of the method
		return String.format("%-20s %d%n", "Employee ID:", employeeId)
				+ String.format("%-20s %s%n", "Employee Name: ", firstName + " " + lastName);
	}
}