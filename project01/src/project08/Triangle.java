package project08;
//구현
public class Triangle extends Shape{

	
	double h;
	double w;
	
	public Triangle() {
		this(0,0);
	}

	public Triangle(double w2, double h2) {
		this.h = w2;
		this.w = h2;
	}
	@Override
	double area() {
		//(가로)x(세로)/2
		return w*h /2;
	}
	
	@Override
	double round() {
		//정삼각형
		return w*3;
	}
	
	public double getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public double getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	@Override
	public String toString() {
		return "Triangle [h=" + h + ", w=" + w + "]";
	}
	
}
