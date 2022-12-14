package gr.codelearn.core.showcase.collection;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

@Slf4j
public class MainSet {
	public static void main(String[] args) {
		Set<String> strings = new HashSet<>();
		// sets: Car car1[1,BMW], car2[1,Mercedes], car3[1,Volvo]
		strings.add("A");
		strings.add("A");
		strings.add("A");
		strings.add("A");
		strings.add("B");
		strings.add("C");

		for (final String string : strings) {
			log.info("{}", string);
		}

		Iterator<String> iterator = strings.iterator();

		while(iterator.hasNext()){
			String next = iterator.next();
			log.info("{}", next);
		}

		Set<String> strings2 = new TreeSet<>();
		LinkedHashSet<String> strings3 = new LinkedHashSet<>();
		//Vector<String> vector = null;

	}
}
