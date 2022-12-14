package gr.codelearn.core.showcase.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;

public class Main {
	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	public static void main(String[] args) {
		logger.info("Hello Java Programmers.");
		logger.info("Current date and time: {}", LocalDateTime.now());
	}
}
