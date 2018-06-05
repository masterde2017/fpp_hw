package W2L5.prog_4;

public class Driver {

	public static void main(String[] args) {
		
		Employee[] ems= new Employee[5];
		CommissionEmployee cmm=new  CommissionEmployee("cmm", "cmmLast", "123456");
		cmm.setCommissionRate(0.25);
		cmm.setGrossSales(1000000);
		ems[0]=cmm;
		
		HourlyEmployee hou = new HourlyEmployee("hou","houLast", "223456");
		hou.setHours(30);
		hou.setWage(20);
		ems[1]=hou;
		
		SalariedEmployee sala = new SalariedEmployee("sal", "salLast", "333456");
		sala.setWeeklySalary(500);
		ems[2]=sala;
		
		BasePlusCommissionEmployee base = new BasePlusCommissionEmployee("base1","base1Last","444456");
		base.setCommissionRate(0.30);base.setGrossSales(3500);base.setBaseSalary(1000);
		ems[3]=base;
		
		BasePlusCommissionEmployee base2 = new BasePlusCommissionEmployee("base2","base2Last","555456");
		base.setCommissionRate(0.30);base.setGrossSales(4000);base.setBaseSalary(1000);
		ems[4]=base2;
		
		double total=0;
		for(Employee e: ems) total+=e.getPayment();
		
		System.out.println("Total salary is: "+ total);
		
		
		
		
	}

}
