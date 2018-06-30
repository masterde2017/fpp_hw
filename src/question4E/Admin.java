package question4E;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		//implement
		double total=0;
		for(Employee em: list){
			total+=em.computeUpdatedBalanceSum();
		}
		return total;
	}
}
