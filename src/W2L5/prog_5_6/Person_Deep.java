package W2L5.prog_5_6;

public class Person_Deep implements Cloneable{
	  private String name;
	  private  Computer computer; // Refer from the Problem 5. 
	   
	   public  Person_Deep(String name,Computer computer){
		   this.name=name;
		   this.computer=computer;
	   }
	   
	   public Object clone() throws CloneNotSupportedException {
		  Person_Deep p=(Person_Deep) super.clone();
		  p.setComputer(this.computer.clone());
		  return p; 
	   }
	   
	   
	   


	public void setName(String name) {
		this.name = name;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		   Computer c= new Computer("mana",  "pro",256,10);
		  
		   Person_Deep p = new Person_Deep("wenxin",c);
		   Person_Deep pc=(Person_Deep)p.clone();
		   
		   System.out.println("after clone the clone object's field:");
		   System.out.println(pc.name);
		   System.out.println(pc.computer);
		   
		   c.setManufacturer("mana_modified");
		   System.out.println("after modifing the computer, clone object's field is still mana ");
		   
		   System.out.println(pc.name);
		   System.out.println(pc.computer);
		   
		   
	   }
}
