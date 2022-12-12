package gr.codelearn.core.showcase.collection;

import gr.codelearn.core.showcase.collection.model.Car;
import gr.codelearn.core.showcase.oop.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Comparator;

public class MainArray {
	private static final Logger logger = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) {
		// static containers (arrays)
		// dynamic containers (collections)
		String[] strings = new String[10];
		strings[0] = "hello";

		logger.info("{}", strings[0]);
		logger.info("{}", strings[1]);
		logger.info("{}", strings[2]);

		//Integer[] integers = new Integer[10];
		int[] integers = new int[3];
		integers[0] = 5555;
		integers[1] = 4444;
		integers[2] = 3333;

		logger.info("{}", integers[0]);
		logger.info("{}", integers[1]);
		logger.info("{}", integers[2]);

		// simple loop
		for (int i = 0; i < integers.length; i++) {
			logger.info("{}", integers[i]);
		}

		// enhanced loop
		for (int number : integers) {
			logger.info("{}", number);
		}

		// inverted simple loop
		for (int i = integers.length - 1; i >= 0; i--) {
			logger.info("{}", integers[i]);
		}

		Arrays.sort(integers);

		for (final int integer : integers) {
			logger.info("!!!!{}", integer);
		}

		Car[] cars = new Car[5];
		cars[0] = new Car(1, "BMW");
		cars[1] = new Car(2, "Mercedes");
		cars[2] = new Car(3, "Volvo");
		cars[3] = new Car(4, "Fiat");
		cars[4] = new Car(5, "Toyota");

		// natural ordering
		//Arrays.sort(cars);
		Arrays.sort(cars, new Comparator<Car>() {
			@Override
			public int compare(final Car c1, final Car c2) {
				return c2.getName().compareTo(c1.getName());
			}
		});

		for (final Car car : cars) {
			logger.info("{}", car);
		}

		String[] stringsToBeSorted = new String[5];
		stringsToBeSorted[0] = "hello";
		stringsToBeSorted[1] = "athina";
		stringsToBeSorted[2] = "volos";
		stringsToBeSorted[3] = "test";
		stringsToBeSorted[4] = "makaronia";

		// natural ordering
		//Arrays.sort(stringsToBeSorted);

		Arrays.sort(stringsToBeSorted);

		for (final String randomStrings : stringsToBeSorted) {
			logger.info("{}", randomStrings);
		}
	}
}
