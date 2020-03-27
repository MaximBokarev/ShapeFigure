package name.mbokarev.entities;

public abstract class ColorShape implements Shape, Colored {

	private Color color;

	protected ColorShape(Color color) {
		super();
		this.color = color;
	}

	@Override
	public Color getColor() {
		return color;
	}


}
