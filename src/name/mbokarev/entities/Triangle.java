package name.mbokarev.entities;

public class Triangle extends ColorShape {

	private double �athet1;
	private double cathet2;
	private double hypotenuse;
	
	public Triangle(Color color, double cathet1, double cathet2) {
		super(color);
		this.�athet1 = cathet1;
		this.cathet2 = cathet2;
	}

	@Override
	public double getArea() {
		return �athet1 * 0.5 * cathet2;
	}

	public double getCathet1() {
		return �athet1;
	}

	public double getCathet2() {
		return cathet2;
	}
	public double getHypotenuse() {
		hypotenuse = Math.sqrt((�athet1 * �athet1) + (cathet2 * cathet2));
		return hypotenuse;
	}

	@Override
	public String toString() {
		return "Figure: Triangle, cathet1 = " + �athet1 + "un., cathet2 = " + cathet2 + "un., hypotenuse = " + getHypotenuse() +  "un., Area = " + getArea() + "sqr.un., Color=" + getColor();
	}

}
