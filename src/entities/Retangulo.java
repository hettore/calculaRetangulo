package entities;

public class Retangulo {

	public double w;
	public double h;
	
	public double area() {
		return w * h;
		
	}
	
	public double perimeter() {
		return 2 * (w + h);
	}
	
	public double diagonal() {
		return Math.sqrt((h * h) + (w * w));
	}
	
}
