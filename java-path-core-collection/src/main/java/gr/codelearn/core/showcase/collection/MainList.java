package gr.codelearn.core.showcase.collection;

import gr.codelearn.core.showcase.collection.model.Car;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@Slf4j
public class MainList {
	public static void main(String[] args) {
		List<String> newList = new ArrayList<>();
		List<String> newList2 = new ArrayList<>(newList);
		newList2.add("2");
		//List<Object> newList3 = List.of(newList.toArray());

		List<String> stringList = List.of("1", "2", "3");
		//stringList.add("5");

		newList.add("1");
		newList.add("2");
		newList.add("3");
		newList.add("4");
		newList.add("5");
		newList.add("6");
		Queue<String> newList4 = new LinkedList<>();

		for (String s : newList) {
			log.info("{}", s);
		}

		log.info("{}", newList);

		List<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		integers.add(4);
		integers.add(5);
		integers.add(6);

		integers.remove(2);
		integers.remove(Integer.valueOf(2));
		integers.add(3, 5);
		//integers.set(2, 10);

		for (final Integer integer : integers) {
			log.info("{}", integer);
		}

		exercise();
	}

	static void exercise(){
		List<Car> carRepository = new ArrayList<>();
		carRepository.add(new Car(1, "BMW")); // index 0
		carRepository.add(new Car(2, "Mercedes"));
		carRepository.add(new Car(3, "Mazda"));
		carRepository.add(new Car(4, "Volvo"));
		carRepository.add(new Car(5, "Fiat"));
		carRepository.add(new Car(6, "Skoda"));
		//
		//Car carToBeDeleted = new Car(2, "Mercedes");
		Car carToBeDeleted = new Car(2);
		// 2
		log.info("{}", carToBeDeleted.equals(carRepository.get(1)));

		carRepository.remove(carToBeDeleted);

		for (final Car car : carRepository) {
			log.info("{}", car);
		}
	}
}
