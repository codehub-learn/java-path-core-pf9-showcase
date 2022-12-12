package gr.codelearn.core.showcase.oop.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Vehicle implements Transport {
	private Long id;
	private String model;

	public Vehicle(Long id, String model) {
		this.id = id;
		this.model = model;
	}

	@Override
	public void move() {

	}

	@Override
	public void stop() {

	}

	@Override
	public void increaseSpeed() {

	}

	@Override
	public void decreaseSpeed() {

	}

	@Override
	public void teleport() {

	}

/*	@Override
	public String toString() {
		return "Vehicle{" + "id=" + id + ", model='" + model + '\'' + '}';
	}*/
}
