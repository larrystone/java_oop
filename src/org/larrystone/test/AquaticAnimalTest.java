package org.larrystone.test;

import org.junit.Assert;
import org.junit.Test;
import org.larrystone.java.AquaticAnimal;

public class AquaticAnimalTest {

	private static final String NAME = "fish";

	private static final String BODY_TYPE = "streamlined";

	AquaticAnimal animal;

	@Test
	public void moveTest() {
		animal = new AquaticAnimal(NAME);

		String expected = "I," + NAME + ", do move about being an animal";
		Assert.assertEquals(expected, animal.move());
	}

	@Test
	public void eatTest() {
		animal = new AquaticAnimal(NAME);

		String expected = "I," + NAME + ", do eat but not like other animals do... <Solo eating>";
		Assert.assertEquals(expected, animal.eat());
	}

	@Test
	public void propertiesTests() {
		animal = new AquaticAnimal(NAME);

		Assert.assertEquals(NAME, animal.getName());
		Assert.assertNull(animal.getBodyType());
		Assert.assertEquals("water", animal.getHabitat());
		Assert.assertEquals(0, animal.getNoOfFins());
		Assert.assertEquals(0, animal.getNoOfLegs());
		Assert.assertEquals(false, animal.isHasTail());

		animal.setHasTail(true);
		animal.setNoOfFins(2);
		animal.setBodyType(BODY_TYPE);

		Assert.assertEquals(true, animal.isHasTail());
		Assert.assertEquals(2, animal.getNoOfFins());
	}

	@Test
	public void swimTest() {
		animal = new AquaticAnimal(NAME, BODY_TYPE);

		String expected = "I think I can swim in the water since I have a " + BODY_TYPE + " body shape";
		Assert.assertEquals(expected, animal.swim());
	}

	@Test
	public void toStringTest() {
		animal = new AquaticAnimal(NAME, BODY_TYPE);

		Assert.assertNotNull(animal.toString());
	}
}
