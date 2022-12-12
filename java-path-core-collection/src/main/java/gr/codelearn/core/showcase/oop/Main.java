package gr.codelearn.core.showcase.oop;

import gr.codelearn.core.showcase.oop.model.Bike;
import gr.codelearn.core.showcase.oop.model.Car;
import gr.codelearn.core.showcase.oop.model.Category;
import gr.codelearn.core.showcase.oop.model.Doors;
import gr.codelearn.core.showcase.oop.model.Movable;
import gr.codelearn.core.showcase.oop.model2.Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		Car car = new Car();
		Bike bike = new Bike(1L, "yamaha", 1995);
		bike.move();

		Bike bike2 = new Bike();
		bike2.setModel("Yamaha");
		logger.info("{}", bike2.getModel());

		logger.info("{}", bike2);

		Car car1 = new Car();
		car1.setNumberOfDoors(Doors.DOORS_SIX);
		logger.info("{}", Doors.DOORS_FIVE);
		logger.info("{}", Doors.DOORS_FIVE.getNumberOfDoors());
		car1.setCategory(Category.ELECTRIC);
		logger.info("{}", Category.ELECTRIC);
		Category category = Category.ELECTRIC;
		Category electric = Category.valueOf("ELECTRIC");
		logger.info("{}", electric);

		Movable car2 = new Car();

		Entity entity = new gr.codelearn.core.showcase.oop.model2.Bike();
	}
}
