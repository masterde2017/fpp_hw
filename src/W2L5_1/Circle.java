package W2L5_1;

public class Circle extends Shape{
	double radius;
	public Circle(Color c,double radius) {
		super(c);
		this.radius=radius;
	}
	
	public double caculateArea() {
		return Math.PI*radius*radius;
	};
	public  double caculatePeremiter() {
		return 2*Math.PI*radius;
	};

}
