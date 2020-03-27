package name.mbokarev.entities;

public class Trapezium extends ColorShape {

	private double base1;
	private double base2;
	private double height;

	public Trapezium(Color color, double base1, double base2, double height) {
		super(color);
		this.base1 = base1;
		this.base2 = base2;
		this.height = height;
	}

	@Override
	public double getArea() {
		return height/2 * (base1 + base2);
	}

	public double getBase1() {
		return base1;
	}

	public double getBase2() {
		return base2;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public String toString() {
		return "Figure: Trapezium, base1 = " + base1 + "un., base2 = " + base2 + "un., height = " + height + "un., Area = " + getArea() + "sqr.un., Color "
				+ getColor();
	}

}
