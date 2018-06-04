package W1L1;

public class Prog1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int x= RandomNumbers.getRandomInt(1,9);
		int y=RandomNumbers.getRandomInt(3,14);
		System.out.println("x = "+x+"   PI^"+x+" = "+Math.pow(Math.PI, x));
		System.out.println("y = "+y+"   y^PI"+" = "+Math.pow(y,Math.PI));

	}

}
