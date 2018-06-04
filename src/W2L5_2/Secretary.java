package W2L5_2;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
	private double overtimeHours;
	public Secretary(String name, double salary, LocalDate hireDate) {
		super(name, salary, hireDate);
		// TODO Auto-generated constructor stub
	}
	public double getOvertimeHours() {
		return overtimeHours;
	}
	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	public double computeSalary() {
		 return 12*overtimeHours+salary;
	 }
	
	

}
