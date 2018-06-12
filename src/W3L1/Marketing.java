package W3L1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Marketing implements Comparator<Marketing> {
	String employeename;
	String productname;
	int salesamount;
	
	public Marketing(String employeename, String productname, int salesamount) {
		super();
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}
	
	


	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeename == null) ? 0 : employeename.hashCode());
		result = prime * result + ((productname == null) ? 0 : productname.hashCode());
		result = prime * result + salesamount;
		return result;
	}





	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Marketing other = (Marketing) obj;
		if (employeename == null) {
			if (other.employeename != null)
				return false;
		} else if (!employeename.equals(other.employeename))
			return false;
		if (productname == null) {
			if (other.productname != null)
				return false;
		} else if (!productname.equals(other.productname))
			return false;
		if (salesamount != other.salesamount)
			return false;
		return true;
	}


	@Override
	public int compare(Marketing arg0, Marketing arg1) {//  sorted by salesamount, if salesamount is equal, sorted by emploreename and productname;
		if(arg0.equals(arg1)) return 0;
		else if(arg0.salesamount==arg1.salesamount) {
			if(arg0.employeename.equals(arg1.employeename))return arg0.employeename.compareTo(arg1.employeename);
			else return arg0.employeename.compareTo(arg1.employeename);
		}
		else if(arg0.salesamount>arg1.salesamount) return 1;
		else return -1;
	}


	@Override
	public String toString() {
		return "Marketing [employeename=" + employeename + ", productname=" + productname + ", salesamount=" + salesamount
				+ "]";
	}



	public static List<Marketing> listMoreThan1000(List<Marketing> list){
		List<Marketing> lt = new ArrayList<>();
		for(Marketing m:list) if(m.salesamount>1000) lt.add(m);//
		return lt;
		
	}
	
	 class CompareEmName implements Comparator<Marketing>{// inner class used to compare  employeename

		@Override
		public  int compare(Marketing o1, Marketing o2) {
			
			return o1.employeename.compareTo(o2.employeename);
		}
		
	}

	public static void main(String[] args) {
		List< Marketing>  lst= new ArrayList<>();
		lst.add(new Marketing("emp1","emp1",800));
		lst.add(new Marketing("emp2","emp2",1100));
		lst.add(new Marketing("amp1","amp1",800));
		lst.add(new Marketing("amp1","amp1",1800));
		lst.add(new Marketing("eyp1","eyp1",800));
		lst.add(new Marketing("mmp1","mmp1",2000));
		lst.add(new Marketing("emp1","emp1",800));
		
		System.out.println(lst.size());
		
		System.out.println("delete  Marketing(\"amp1\",\"amp1\",800)");
		lst.remove(new Marketing("amp1","amp1",800));
		System.out.println(lst.size());
		
		Marketing mkCompare=new Marketing(null,null,0);
		System.out.println("before sorted list is: \n"+lst);
		lst.sort(mkCompare);
		System.out.println("after sorted list is : \n"+lst);
		
		lst=Marketing.listMoreThan1000(lst);
		lst.sort(mkCompare.new CompareEmName());
		System.out.println("geting more than 1000$ sales, and also sorted by employeename: \n"+lst);
		
		

	}





	

}
