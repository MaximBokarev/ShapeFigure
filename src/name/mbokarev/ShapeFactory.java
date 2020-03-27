package name.mbokarev;

import name.mbokarev.entities.Circle;
import name.mbokarev.entities.Shape;
import name.mbokarev.entities.Square;
import name.mbokarev.entities.Trapezium;
import name.mbokarev.entities.Triangle;

public class ShapeFactory {

	private int shapesNumber = ShapeEnum.values().length;

	public Shape getRandomShape() {
		return ShapeEnum.values()[Utils.nextInt(shapesNumber)].getInstance();
	}

	private static enum ShapeEnum {
		SQUARE {
			Shape getInstance() {
				return new Square(Utils.nextColor(), Utils.nextDouble());
			}
		},
		TRIANGLE {
			Shape getInstance() {
				return new Triangle(Utils.nextColor(), Utils.nextDouble(), Utils.nextDouble());
			}
		},
		CIRCLE {
			Shape getInstance() {
				return new Circle(Utils.nextColor(), Utils.nextDouble());
			}
		},
		TRAPEZIUM {
			Shape getInstance() {
				return new Trapezium(Utils.nextColor(), Utils.nextDouble(),
						Utils.nextDouble(), Utils.nextDouble());
			}
		};

		Shape getInstance() {
			throw new RuntimeException("Opps, it shouldn't have happened");
		}
	}

}
