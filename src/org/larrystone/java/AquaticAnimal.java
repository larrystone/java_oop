package org.larrystone.java;

public class AquaticAnimal extends Animal {
	private int noOfFins;
	private String bodyType;

	public AquaticAnimal(String name) {
		super(name, "water");
		this.noOfFins = 0;
		this.setNoOfLegs(0);
	}

	public AquaticAnimal(String name, String bodyType) {
		super(name, "water");
		this.bodyType = bodyType;
		this.setNoOfLegs(0);
	}

	@Override
	public String eat(){
		return "I," + getName() +", do eat but not like other animals do... <Solo eating>";
	}

	public String swim() {
		return "I think I can swim in the " + getHabitat() + " since I have a " + bodyType + " body shape";
	}

	public int getNoOfFins() {
		return noOfFins;
	}

	public void setNoOfFins(int noOfFins) {
		this.noOfFins = noOfFins;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	@Override
	public String toString() {
		return "Name : " + getName()
				+ "Habitat : " + getHabitat()
				+ "noOfEyes : " + getNoOfEyes()
				+ "noOfLegs : " + getNoOfLegs()
				+ "noOfFins : " + getNoOfFins()
				+ "Tail : " + isHasTail();
	}
}
