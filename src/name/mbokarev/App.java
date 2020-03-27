package name.mbokarev;

import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		int elementsNumber = Utils.nextInt(10) + 1;
		Stream.generate(shapeFactory::getRandomShape)
			.limit(elementsNumber)
			.forEach(s -> s.draw());
		
	}

}
