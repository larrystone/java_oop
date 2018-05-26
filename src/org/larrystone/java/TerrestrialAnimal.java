package org.larrystone.java;

public class TerrestrialAnimal extends Animal {
	private int noOfEars = 2;
	private MovementType movementType = MovementType.WALKING;

	public TerrestrialAnimal(String name) {
		super(name, "Land");
		this.setHabitat("Land");
	}

	public TerrestrialAnimal(String name, String habitat) {
		super(name, habitat);
		this.setHabitat(habitat);
	}

	public int getNoOfEars() {
		return noOfEars;
	}

	public void setNoOfEars(int noOfEars) {
		this.noOfEars = noOfEars;
	}

	public MovementType getMovementType() {
		return movementType;
	}

	public void setMovementType(MovementType movementType) {
		this.movementType = movementType;
	}

	@Override
	public String toString() {
		return "Name : " + getName()
				+ ", Habitat : " + getHabitat()
				+ ", noOfEyes : " + getNoOfEyes()
				+ ", noOfLegs : " + getNoOfLegs()
				+ ", Tail : " + isHasTail()
				+ ", moves by : " + getMovementType().toString();
	}
}
