package gr.codelearn.core.showcase.collection;

import gr.codelearn.core.showcase.collection.model.Car;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
	@Override
	public int compare(final Car c1, final Car c2) {
		//c1: 5
		//c2: 2
		// 5-2 == 3
		return c2.getId() - c1.getId();
	}
}
