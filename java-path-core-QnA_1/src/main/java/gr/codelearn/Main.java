package gr.codelearn;

import gr.codelearn.util.FileReader;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Main {
	public static void main(String[] args) {
		List<String> lines = FileReader.readFile("java-path-core-QnA_1/sample.log");
		log.info("{}", lines);
	}
}
