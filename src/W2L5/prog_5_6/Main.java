package W2L5.prog_5_6;

public class Main {

	public static void main(String[] args) {
		Computer cc= new Computer("Mana",  "pro", 256,10 );
		Computer cc2= new Computer("Mana",  "pro", 256,10 );
		Computer cc3= new Computer("Mana",  "pro", 256,1 );
		
		System.out.println("cc equals cc2 ?  "+cc.equals(cc2));
		
		System.out.println("cc2 equals cc3 ?  "+cc2.equals(cc3));
		
		System.out.println("cc equals cc3 ?  "+cc.equals(cc3));
		
		

	}

}
