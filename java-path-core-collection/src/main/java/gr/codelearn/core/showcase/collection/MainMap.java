package gr.codelearn.core.showcase.collection;

import lombok.extern.slf4j.Slf4j;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Slf4j
public class MainMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Java", "Programming Language");
		map.put("Java", "Programming Language 1");
		map.put("Java", "Programming Language 2");
		map.put("Java", "Programming Language 3");
		map.put("Git", "Version Control System");
		map.put("C++", "Programming Language");
		map.put("Mercury", "Version Control System");

		String defaultValueForJava = map.getOrDefault("Java", "0");

		Map.of("1", "2", "3", "4", "5", "6");
		Map.ofEntries(Map.entry("1", "2"), Map.entry("3", "4"));

		Set<Map.Entry<String, String>> entries = map.entrySet();
		Set<String> strings = map.keySet();
		Collection<String> values = map.values();

		log.info("{}", map.get("Java"));

	}
}
