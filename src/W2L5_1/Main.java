package W2L5_1;

public class Main {

	public static void printTotal(Shape[] shapes) {
		double area=0,peremeter=0;
		for(Shape s: shapes) {
			area+=s.caculateArea();
			peremeter+=s.caculatePeremiter();
		}
		System.out.println("taotal area: "+area+"\n"+"total peremeters: "+peremeter);
	}
	public static void main(String[] args) {
		Shape[] shapes= {new Rectangle(Color.blue,1.0,2.0),
				new Rectangle(Color.blue,2.0,2.5),
				new Rectangle(Color.blue,1.0,3.0),new Square(Color.green,5.1),new Circle(Color.red,5)};
		printTotal(shapes);

	}

}
