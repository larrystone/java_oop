package org.larrystone.test;

import org.junit.Assert;
import org.junit.Test;
import org.larrystone.java.MovementType;
import org.larrystone.java.TerrestrialAnimal;

public class TerrestrialAnimalTest {

	private static final String NAME1 = "Lion";

	private static final String NAME2 = "Eagle";

	TerrestrialAnimal animal;

	@Test
	public void moveTest() {
		animal = new TerrestrialAnimal(NAME1);

		String expected = "I," + NAME1 + ", do move about being an animal";
		Assert.assertEquals(expected, animal.move());
	}

	@Test
	public void eatTest() {
		animal = new TerrestrialAnimal(NAME1);

		String expected = "I," + NAME1 + ", do eat because I am an animal";
		Assert.assertEquals(expected, animal.eat());
	}

	@Test
	public void propertiesTests() {
		animal = new TerrestrialAnimal(NAME1);

		Assert.assertEquals(NAME1, animal.getName());

		Assert.assertEquals("Land", animal.getHabitat());
		Assert.assertEquals(2, animal.getNoOfEars());
		Assert.assertEquals(2, animal.getNoOfLegs());
		Assert.assertEquals(false, animal.isHasTail());

		animal.setHasTail(true);
		animal.setNoOfLegs(4);

		Assert.assertEquals(true, animal.isHasTail());
		Assert.assertEquals(4, animal.getNoOfLegs());
	}

	@Test
	public void toStringTest() {
		animal = new TerrestrialAnimal(NAME1);

		Assert.assertEquals("Name : Lion, Habitat : Land, noOfEyes : 2, noOfLegs : 2, Tail : false, moves by : WALKING",
				animal.toString());

		animal = new TerrestrialAnimal(NAME2, "Air");
		animal.setMovementType(MovementType.FLYING);

		Assert.assertEquals("Name : Eagle, Habitat : Air, noOfEyes : 2, noOfLegs : 2, Tail : false, moves by : FLYING",
				animal.toString());
	}
}
