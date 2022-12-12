package gr.codelearn.core.showcase.collection.model;

public enum Doors {
	DOORS_TWO(2), DOORS_FOUR(4), DOORS_FIVE(5), DOORS_SIX(6);

	private int numberOfDoors;

	Doors(final int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}
}
