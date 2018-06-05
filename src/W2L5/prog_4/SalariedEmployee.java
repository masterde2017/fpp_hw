package W2L5.prog_4;

public class SalariedEmployee extends Employee {
	private double weeklySalary;
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
		
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [weeklySalary=" + weeklySalary + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}
	
	

}
