package W2L5.prog_4;

public abstract class Employee {
	protected String firstName;
	protected String lastName;
	protected String socialSecurityNumber;
	public Employee(String firstName,String lastName,String socialSecurityNumber ) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.socialSecurityNumber=socialSecurityNumber;
		
	}
	public abstract double getPayment();

}
