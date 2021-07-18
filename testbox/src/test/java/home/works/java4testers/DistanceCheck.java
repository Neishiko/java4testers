package home.works.java4testers;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceCheck {
	@Test
	public void checkPlusDistance() {
		Point p1 = new Point(0, 25);
		Point p2 = new Point(25, 0);
		Assert.assertEquals(p1.distance(p2), 35.35533905932738);
	}

	@Test
	public void checkMinusDistance() {
		Point p1 = new Point(-15, -25);
		Point p2 = new Point(25, 15);
		Assert.assertEquals(p1.distance(p2), 56.568542494923804);
//		Странно, но идея считает точнее, чем онлайн калькулятор(56.568542494924)
	}

	@Test
	public void checkZeroDistance() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(25, 0);
		Assert.assertEquals(p1.distance(p2), 25);
	}
}
