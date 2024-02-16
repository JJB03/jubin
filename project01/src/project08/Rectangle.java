package project08;

public class Rectangle extends Shape {
	double h;
	double w;
	
	public Rectangle() {
		this(0,0);
	}

	public Rectangle(double h, double w) {
		this.h = h;
		this.w = w;
	}

	@Override
	double area() {
		// TODO Auto-generated method stub
		return w*h;
	}
	
	@Override
	double round() {
		
		return (w+h)*2;
	}
	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}
	
	@Override
	public String toString() {
		return "Rectangle [h=" + h + ", w=" + w + "]";
	}

	
	
	

}
