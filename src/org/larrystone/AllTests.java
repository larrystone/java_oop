package org.larrystone;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.larrystone.test.AnimalTest;
import org.larrystone.test.AquaticAnimalTest;
import org.larrystone.test.TerrestrialAnimalTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
		AnimalTest.class,
		AquaticAnimalTest.class,
		TerrestrialAnimalTest.class
})
public class AllTests {
	public static void main(String[] args){
		junit.textui.TestRunner.run (suite());
	}

	public static Test suite() {
		return new JUnit4TestAdapter(AllTests.class);
	}
}
