package name.mbokarev.entities;

public class Square extends ColorShape {

	private double side;

	public Square(Color color, double side) {
		super(color);
		this.side = side;
	}

	@Override
	public double getArea() {
		return Math.sqrt(side);
	}

	public double getA() {
		return side;
	}

	@Override
	public String toString() {
		return "Figure: Square, side = " + side + "un., Area = " + getArea() + "sqr.un, Color " + getColor();
	}

}
