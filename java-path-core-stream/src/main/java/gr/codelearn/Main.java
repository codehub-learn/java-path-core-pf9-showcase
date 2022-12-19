package gr.codelearn;

import gr.codelearn.model.Category;
import gr.codelearn.model.Transaction;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Slf4j
public class Main {
	public static void main(String[] args) {
		List<String> newList = new ArrayList<>();
		newList.add("1");
		newList.add("2");
		newList.add("3");
		newList.add("4");
		newList.add("5");
		newList.add("6");

		Stream<String> stream = newList.stream();

		List<Transaction> transactions = List.of(new Transaction(1, Category.GROCERIES, 100, 0),
												 new Transaction(2, Category.PC_PARTS, 200, 0),
												 new Transaction(3, Category.GROCERIES, 300, 0),
												 new Transaction(4, Category.PC_PARTS, 400, 0),
												 new Transaction(5, Category.CARS, 500, 0),
												 new Transaction(6, Category.PC_PARTS, 600, 0));

		// @formatter:off (notifies intellij to not format the following code
		List<Integer> integerList = transactions.stream()
												.filter(t -> t.getCategory() == Category.GROCERIES)
												/*
												.sorted(new Comparator<Transaction>() {
													@Override
													public int compare(final Transaction t1, final Transaction t2) {
														return (int) (t1.getValue() - t2.getValue());
													}
												})
												*/
												/*
												.sorted((Transaction t1, Transaction t2) -> {
													return (int)(t1.getValue() - t2.getValue());
												})
												*/
												//.sorted((t1, t2) -> (int)(t1.getValue() - t2.getValue()))
												//.sorted(Comparator.comparingDouble(t -> t.getValue()))
												.sorted(Comparator.comparingDouble(Transaction::getValue).reversed()) // method reference
												//.map(t -> t.getId())
												.map(Transaction::getId) // method reference once again
												.collect(Collectors.toList());
											  //.forEach(t -> log.info("{}", t));
		// @formatter:on

		streamCreateActions();

		log.info("------------------");

		List<String> list1 = List.of("four", "five");
		List<String> list2 = List.of("one", "one", "one");
		List<String> list3 = List.of("one", "one", "one");

		Stream.concat(list1.stream(), list2.stream());

		List<List<String>> listOfLists = List.of(list1, list2, list3);
		List<String> strings = listOfLists.stream().flatMap(l -> l.stream()).collect(Collectors.toList());

		streamCreateActions();

		streamTerminalActions();

	}

	private static void streamTerminalActions() {
		getList().stream().collect(Collectors.toList());
		List<String> stringList = getList().stream().toList();

		getList().stream().collect(Collectors.toSet());

		List<String> collect = getList().stream().collect(Collectors.toCollection(LinkedList::new));

		Map<String, Integer> map = getList().stream().distinct().collect(
				Collectors.toMap(s -> s, s -> s.length()));//key: String, value: length

		map.forEach((k, v) -> log.info("key:{}, value:{}", k, v));

		log.info("-----");

		Map<Character, List<String>> map2 = getList().stream().distinct().collect(
				Collectors.groupingBy(s -> s.charAt(0))); //key: String, value: length
		map2.forEach((k, v) -> log.info("key:{}, value:{}", k, v));

		// reduce

		Double result = getTransactions().stream()
										 .map(t -> t.getValue() * t.getQuantity())
										 .reduce(0.0, (r1, r2) -> r1 + r2);

/*		double result2 = 0.0;
		for (final Transaction transaction : getTransactions()) {
			int quantity = transaction.getQuantity();
			double value = transaction.getValue();

			result2 += (quantity*value);
		}
		*/

		log.info("{}", result);
	}

	private static void streamCreateActions() {
		Stream<String> streamOfList = List.of("one", "one", "one", "two", "three", "four", "five").stream();

		streamOfList.distinct().forEach(log::info);

		//streamOfList.distinct().forEach(log::info); //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed

		Stream<String> streamOfList2 = Stream.of("one", "two", "three", "four", "five");
		String[] array = {"one", "one", "one", "two", "three", "four", "five"};
		Arrays.stream(array);

		Stream<Integer> integerStream = Stream.iterate(0, n -> n + 2).limit(5); // 0, 2, 4, 6, 8, 10,
		Stream<String> generatedStream = Stream.generate(() -> "test").limit(
				5); // "test", "test", "test", "test", "test"

		IntStream range = IntStream.range(1, 20);
	}

	private static List<String> getList() {
		return List.of("one", "one", "one", "two", "three", "four", "five");
	}

	private static List<Transaction> getTransactions(){
		return List.of(new Transaction(1, Category.GROCERIES, 100, 0),
														new Transaction(2, Category.PC_PARTS, 20, 1),
														new Transaction(3, Category.GROCERIES, 30, 2),
														new Transaction(4, Category.PC_PARTS, 40, 4),
														new Transaction(5, Category.CARS, 50, 2),
														new Transaction(6, Category.PC_PARTS, 60, 2));
	}

}
