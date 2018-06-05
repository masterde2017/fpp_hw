package W2L5.prog_5_6;

public class Person_Shalow implements Cloneable{
	  private String name;
	  private  Computer computer; // Refer from the Problem 5. 
	   
	   public  Person_Shalow(String name,Computer computer){
		   this.name=name;
		   this.computer=computer;
	   }
	   
	   public Object clone() throws CloneNotSupportedException {
		  Person_Shalow p=(Person_Shalow) super.clone();
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
		  
		   Person_Shalow p = new Person_Shalow("wenxin",c);
		   Person_Shalow pc=(Person_Shalow)p.clone();
		   
		   System.out.println("after clone the clone object's field:");
		   System.out.println(pc.name);
		   System.out.println(pc.computer);
		   
		   c.setManufacturer("mana_modified");
		   System.out.println("after modifing the computer, clone object's field change to 'mana_modified from mana' ");
		   
		   System.out.println(pc.name);
		   System.out.println(pc.computer);
		   
		   
	   }
}
