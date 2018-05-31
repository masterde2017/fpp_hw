import java.util.Scanner;

public class Prog7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int count=0;

		while(sc.hasNext()){
			String s=sc.nextLine();
			System.out.println("the length of command line is: "+s.length());
			if(s.startsWith("A")) count++;
			System.out.println("the number of string begin with A is: "+count);
		}

	}

}
