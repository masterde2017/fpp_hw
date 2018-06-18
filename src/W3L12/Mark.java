package W3L12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mark {

	

	
	
	
	
	public static void main(String[] args) {
		// o avoid negative, nonnumbers
		boolean flag= true;
		int input =-1;
		
		while(flag) {
			try {
				System.out.println("input your number");
				Scanner  sc = new Scanner(System.in);
				 input= sc.nextInt();
				 if(input>=100||input<0) throw new InputMismatchException("Excetpion: negative or exceed range 0, 100");
				 System.out.println("Your input is: "+input);
					flag=false;
			} catch (InputMismatchException e) {
				if(e.getMessage()!=null&&e.getMessage().equals("negative or exceed range 0, 100"))System.out.println(e.getMessage());
				else System.out.println("Exception: non-number");
			}
				
			
		}
		
		
		
	}	
	
	

}
