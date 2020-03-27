package name.mbokarev.entities;

public class Circle extends ColorShape {

	private double radius;

	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.sqrt(radius);
	}

	public double getR() {
		return radius;
	}

	@Override
	public String toString() {
		return "Figure: Circle, radius = " + radius + "un, Area = " + getArea() + "sq.un., color " + getColor();
	}

}
