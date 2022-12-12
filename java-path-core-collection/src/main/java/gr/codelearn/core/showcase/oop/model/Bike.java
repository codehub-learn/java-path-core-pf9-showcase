package gr.codelearn.core.showcase.oop.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class Bike extends Vehicle {
	private Integer year;

	public Bike(){}

	public Bike(Long id, String name, Integer year){
		super(id, name);
/*
		super.setId(1L);
		this.setId(1L);
		*/
		this.year = year;
	}

	public void move(){
		super.move();
		// ....
	}

/*	@Override
	public String toString() {
		return "Bike{" + "year=" + year + "} " + super.toString();
	}*/
}
