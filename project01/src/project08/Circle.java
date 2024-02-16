package project08;

public class Circle extends Shape {

	double r;
	
	public Circle() {
	this(0);
	}

	public Circle( double r) {
		this.r = r;
	}
@Override
	double area() {
		// TODO Auto-generated method stub
		return Math.PI*(2*r);
	}

	@Override
	double round() {
		// TODO Auto-generated method stub				
	return 2*Math.PI*r;
	}
	

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}
	
	
}
