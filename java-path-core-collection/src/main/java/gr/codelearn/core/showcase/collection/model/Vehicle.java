package gr.codelearn.core.showcase.collection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Data
public class Vehicle {
	private Long id;
	private String model;

	public Vehicle(Long id, String model) {
		this.id = id;
		this.model = model;
	}

	public void move(){

	}

/*	@Override
	public String toString() {
		return "Vehicle{" + "id=" + id + ", model='" + model + '\'' + '}';
	}*/
}
