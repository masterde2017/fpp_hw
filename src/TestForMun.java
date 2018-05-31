
public class TestForMun {

	public TestForMun() {
		
	}

	public static int computeWeightedSum(int[] a){
		int sum=0;
		for(int element:a) sum+=element%2==0? 2*element:3*element;
		return sum;
	}
	
	public static int  isOnionArray(int[ ] a){
		for(int i=0;i<a.length/2;i++) 
			if(i!=a.length-1-i&&a[i]+a[a.length-1-i]>10) return 0;
		return 1;
	}
	
	public static int isSelfReferential(int[ ] a){
		
		if(a==null||a.length==0) return 0;
		
		for(int i=0;i<a.length;i++){
			int count=0;
			for(int j=0;j<a.length;j++)  if(a[j]==i) count++;
			if(a[i]!=count) return 0;
		}
		
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1={2};
	//	{1, 2, 3, 4, 5};
	//	{1, 3, 5};
		
	//	{0, 0, 0, 0, 0};
	//		{1};
//		{4};
		
		int b1=computeWeightedSum( a1);
//		System.out.println(b1);
		
		int[] a2={2};
		int b2=isOnionArray(a2);
//		System.out.println(b2);
		
		
		int[] a=	{2, 0, 0} ,
		      t1=  {2, 0, 2, 0},
				t2={2, 1, 2, 0, 0},
				t3={3, 2, 1, 1, 0, 0, 0},
				t4={4, 2, 1, 0, 1, 0, 0, 0},
				t5={5, 2, 1, 0, 0, 1, 0, 0, 0},
				t6={6, 2, 1, 0, 0, 0, 1, 0, 0, 0} ;
		
		int b=isSelfReferential(t1);
		System.out.println(b);
	}

}
