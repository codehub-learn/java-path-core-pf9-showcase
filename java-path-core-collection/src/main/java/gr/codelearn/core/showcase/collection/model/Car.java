package gr.codelearn.core.showcase.collection.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@AllArgsConstructor
@Data
public class Car {
	private int id;
	private String name;

	public Car(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(final Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Car car = (Car) o;
		return id == car.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
