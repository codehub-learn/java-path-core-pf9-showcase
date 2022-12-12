package gr.codelearn.core.showcase.oop.model;

import lombok.Data;

@Data
public class Car extends Vehicle{
	private String brand;
	private Doors numberOfDoors;
	private Category category;
}
