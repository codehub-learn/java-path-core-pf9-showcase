package gr.codelearn;

import gr.codelearn.model.Category;
import gr.codelearn.model.Transaction;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
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

		List<Transaction> transactions = List.of(new Transaction(1, Category.GROCERIES, 100),
												 new Transaction(2, Category.PC_PARTS, 200),
												 new Transaction(3, Category.GROCERIES, 300),
												 new Transaction(4, Category.PC_PARTS, 400),
												 new Transaction(5, Category.CARS, 500),
												 new Transaction(6, Category.PC_PARTS, 600));

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
	}

	private static void streamTerminalActions(){

	}

	private static void streamCreateActions() {
		Stream<String> streamOfList = List.of("one", "one", "one", "two", "three", "four", "five").stream();

		streamOfList.distinct().forEach(log::info);

		//streamOfList.distinct().forEach(log::info); //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed

		Stream<String> streamOfList2 = Stream.of("one", "two", "three", "four", "five");
		String[] array = {"one", "one", "one", "two", "three", "four", "five"};
		Arrays.stream(array);


		Stream<Integer> integerStream = Stream.iterate(0, n -> n + 2).limit(5); // 0, 2, 4, 6, 8, 10,
		Stream<String> generatedStream = Stream.generate(()-> "test").limit(5); // "test", "test", "test", "test", "test"

		IntStream range = IntStream.range(1, 20);
	}

	private static List<String> getList(){
		return List.of("one", "one", "one", "two", "three", "four", "five");
	}



}
