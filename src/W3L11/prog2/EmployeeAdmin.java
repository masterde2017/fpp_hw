package W3L11.prog2;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class EmployeeAdmin {
	
	/**
		Returns a list of Employees whose social security number is on the input list socSecNums
		and whose salary is > 80000. The list must be ordered by social security number,
		from lowest to highest. To sort, you must use a Collections sorting method
		and you must define your own Comparator to be used to compare Employees by ssn. 
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		List<Employee> list = new ArrayList<>();
		for(String sn: socSecNums) if(table.get(sn)!=null&&table.get(sn).getSalary()>80000) 
			list.add(table.get(sn));
		Collections.sort(list, new Comparator<Employee>() {
			@Override
			public int compare(Employee arg0, Employee arg1) {
				return arg0.getSsn().compareTo(arg1.getSsn());
			}
			
		});
		return list;
		
	}
	
}
