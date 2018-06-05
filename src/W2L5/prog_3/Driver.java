package W2L5.prog_3;

public class Driver {
	public static void main(String[] args) {
		Figure[] fs = new Figure[5];
		fs[0]= new UpwardHat();
		fs[1]= new UpwardHat();
		fs[2]=new DownardHat();
		fs[3]= new FaceMaker();
		fs[4]= new Vertical();
		for(Figure f: fs) f.getFigure();
		
		
		System.out.println("");
		for(Figure f: fs) {
			System.out.print(f.getClass().getSimpleName()+": ");
			f.getFigure();	
			System.out.println("");
		}
		
		
	}	
}
