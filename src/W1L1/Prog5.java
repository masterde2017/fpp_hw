package W1L1;
import java.util.Random;

public class Prog5 {
	
	public static void com(){
		
		int[][]  numSet=new int[4][4];
		for(int i=0;i<4;i++){
		    for(int j=0;j<4;j++){
		    numSet[i][j]= RandomNumbers.getRandomInt(1, 99);
		    }
		}
		StringBuilder  sb=new StringBuilder("   ______ ");
		for(int i=0;i<4;i++){
		    StringBuilder s=new StringBuilder();
		    for(int j=0;j<4;j++){
		    	
		    	if(i==0||i==2)  s.append(String.format("%7s"+"%d"," ",numSet[i][j]));
		    	else  s.append(String.format("%6s"+"+%d"," ",numSet[i][j]));
		   }
		   System.out.println(s+"\n");
		   String sbs=sb.toString();
		   if(i==1||i==3) System.out.println("\n"+sbs + sbs + sbs+ sbs+"\n"+"\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		com();
		
	}

}
