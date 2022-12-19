package gr.codelearn;

import gr.codelearn.util.FileReader;
import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.List;

@Slf4j
public class Main {
	public static void main(String[] args) {
		List<String> lines = FileReader.readFile("java-path-core-QnA_1/sample.log");
		log.info("{}", lines);

		//lines.forEach(line -> log.info("{}", extractLogType(line)));

		HashSet<String> typesOfLog = new HashSet<>();

		for (String line : lines) {
			String typeOfLog = extractLogType(line);
			if(!typeOfLog.equals("N/A")){
				typesOfLog.add(typeOfLog);
			}
		}
		log.info("Types of logs:");
		typesOfLog.forEach(log::info);

	}

	private static String extractLogType(String line) {
		try {
			int beginningBracket = line.indexOf('[');
			int endingBracket = line.indexOf(']');
			return line.substring(beginningBracket + 1, endingBracket);
		} catch (StringIndexOutOfBoundsException e) {
			log.warn("{}", line);
			log.warn("{}", e.getMessage());
			return "N/A";
		}
	}
}
