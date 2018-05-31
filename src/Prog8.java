
public class Prog8 {

	public static void min(int[] a){

		int min=a[0];

		for(int i:a) if(i<min) min=i;

		System.out.println("the min of the array is:"+min);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a={2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, 22};
		 min( a);
	}

}
