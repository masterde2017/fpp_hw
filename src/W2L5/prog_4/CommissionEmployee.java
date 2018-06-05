package W2L5.prog_4;

public class CommissionEmployee extends Employee {
	protected double grossSales;
	protected double commissionRate;
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber) {
		super(firstName, lastName, socialSecurityNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return grossSales*commissionRate;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}

	@Override
	public String toString() {
		return "CommissionEmployee [grossSales=" + grossSales + ", commissionRate=" + commissionRate + ", firstName="
				+ firstName + ", lastName=" + lastName + ", socialSecurityNumber=" + socialSecurityNumber + "]";
	}
	
	

}
