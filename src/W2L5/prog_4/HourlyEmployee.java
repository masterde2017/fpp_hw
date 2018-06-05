package W2L5.prog_4;

public class HourlyEmployee extends Employee {
	private double wage;
	private double hours;
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return wage*hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hours=" + hours + ", firstName=" + firstName + ", lastName="
				+ lastName + ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}
	
	

}
