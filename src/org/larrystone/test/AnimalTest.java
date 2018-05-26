package org.larrystone.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.larrystone.java.Animal;

public class AnimalTest {
	private static final String NAME = "dog";
	Animal animal;
	@Before
	public void setUp() throws Exception {
		animal = new Animal(NAME);
	}

	@After
	public void tearDown() {
		animal = null;
	}

	@Test
	public void moveTest() {
		String expected = "I," + NAME +", do move about being an animal";
		Assert.assertEquals(expected, animal.move());
	}

	@Test
	public void eatTest() {
		String expected = "I," + NAME +", do eat because I am an animal";
		Assert.assertEquals(expected, animal.eat());
	}

	@Test
	public void propertiesTests() {
		Assert.assertEquals(NAME, animal.getName());
		Assert.assertNull(animal.getHabitat());
		Assert.assertEquals(2, animal.getNoOfEyes());
		Assert.assertEquals(2, animal.getNoOfLegs());
		Assert.assertEquals(false, animal.isHasTail());

		animal.setHabitat("Land");
		animal.setHasTail(true);

		Assert.assertEquals(true, animal.isHasTail());
		Assert.assertEquals("Land", animal.getHabitat());
	}
}
