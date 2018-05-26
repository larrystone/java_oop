package org.larrystone.java;

public class Animal implements BaseActions{
	private String name;
	private int noOfEyes = 2;
	private int noOfLegs = 2;
	private String habitat;
	private boolean hasTail = false;

	public Animal(String name) {
		this.name = name;
	}

	public Animal(String name, String habitat) {
		this.name = name;
		this.habitat = habitat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfEyes() {
		return noOfEyes;
	}

	public void setNoOfEyes(int noOfEyes) {
		this.noOfEyes = noOfEyes;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOflegs) {
		this.noOfLegs = noOflegs;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public boolean isHasTail() {
		return hasTail;
	}

	public void setHasTail(boolean hasTail) {
		this.hasTail = hasTail;
	}

	@Override
	public String move() {
		return "I," + name +", do move about being an animal";
	}

	@Override
	public String eat() {
		return "I," + name +", do eat because I am an animal";
	}
}
