package W2L5.prog_4;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return super.getPayment()+baseSalary;
	}
	
	
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [baseSalary=" + baseSalary + ", grossSales=" + grossSales
				+ ", commissionRate=" + commissionRate + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}
	
	
	
	
}
