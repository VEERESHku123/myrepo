package Assignment;

public class Circle {
	private double radius;
	private String colour;
	public Circle(double radius, String colour) {
		super();
		this.radius = radius;
		this.colour = colour;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", colour=" + colour + "]";
	}
	
	public String getInput() {
		System.out.println("Circle Inputs:");
		return toString();
	}
	
	public double CircleArea() {
		double r=getRadius();
		return 3.14*r*r;
	}
	
}
