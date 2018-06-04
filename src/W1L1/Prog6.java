package W1L1;
import java.util.Arrays;

public class Prog6 {
	 static String[] RemoveDups(String[] s){
		 String[] res=new String[s.length];
		 int count=0;
		 for(int i=0;i<s.length-1;i++){

			 for(int j=i+1;j<s.length;j++){

				 if(s[i].equals(s[j])) break;
	
				 if(j==s.length-1) res[count++]=s[i];
			 }
			 
		 }
		res[count++]=s[s.length-1];
		 String[] result=new String[count];
		 //System.arraycopy(res,0,count,result,0 );
		for(int i= 0;i<count;i++) result[i]=res[i];
		return result;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"horse", "dog", "cat", "horse","dog"} ;
		System.out.println(Arrays.toString(RemoveDups(s)));
	}

}
