package W2L5_1;

public class Rectangle extends Shape{
	protected double length;
	protected double width;
	public Rectangle(Color c,double length,double width) {
		super(c);
		this.length = length;
		this.width = width;
		// TODO Auto-generated constructor stub
	}
	
	public double caculateArea() {
		return length*width;
	};
	public  double caculatePeremiter() {
		return 2*length+2*width;
	};

}
