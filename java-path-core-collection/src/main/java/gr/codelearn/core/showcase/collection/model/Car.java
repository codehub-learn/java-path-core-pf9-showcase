package gr.codelearn.core.showcase.collection.model;

import lombok.Data;

@Data
public class Car extends Vehicle{
	private String brand;
	private Doors numberOfDoors;
	private Category category;
}
