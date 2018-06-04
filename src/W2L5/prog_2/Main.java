package W2L5.prog_2;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		DeptEmployee[] department = new DeptEmployee[5];
		DeptEmployee p1=new Professor("p1", 500, LocalDate.of(2011, 10,12));
		DeptEmployee p2=new Professor("p2", 600, LocalDate.of(2001, 5,12));
		DeptEmployee p3=new Professor("p3", 700, LocalDate.of(2018, 01,12));
		Secretary s1=new Secretary("s1", 200, LocalDate.of(2005, 01,10));
		s1.setOvertimeHours(30);
		Secretary s2=new Secretary("s2", 200, LocalDate.of(2001, 05,10));
		s1.setOvertimeHours(40);
		department[0]=p1;
		department[1]=p2;
		department[2]=p3;
		department[3]=s1;
		department[4]=s2;
		
		
		double totalSalaryOfProfessor=0,totalSalaryOfSecretay=0,totalSalary=0;
		for(DeptEmployee em: department) {
			if(em instanceof Professor) totalSalaryOfProfessor+=em.computeSalary();
			else totalSalaryOfSecretay+=em.computeSalary();
			totalSalary= totalSalaryOfProfessor+totalSalaryOfSecretay;
		}
		
		Scanner sc= new Scanner(System.in);
		System.out.println(" Would you like to see the sum of all Professor salary, sum of all secretary salary and all salaries in the department");
		String s= sc.nextLine();
		if(s.equalsIgnoreCase("Y")) {
			System.out.println(" All professor salary"+totalSalaryOfProfessor+"\n"+
								" All secretary salary"+ totalSalaryOfSecretay+"\n"+
								" All salaries in the department"+totalSalary);
		}
		
		
		
	}

}
