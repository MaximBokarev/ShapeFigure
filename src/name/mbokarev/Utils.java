package name.mbokarev;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Random;

import name.mbokarev.entities.Color;

public class Utils {
	private static Random random = new Random();
	private static MathContext mc = new MathContext(3);

	public static int nextInt(int bound) {
		return random.nextInt(bound);
	}

	public static double nextDouble() {
		double raw = random.nextDouble() * 10;
		return BigDecimal.valueOf(raw).round(mc).doubleValue();
	}

	public static Color nextColor() {
		int l = Color.values().length;
		return Color.values()[random.nextInt(l)];
	}

}
