package name.mbokarev.entities;

public interface Shape {

	default void draw() {
		System.out.println(this);
	}

	double getArea();

}
