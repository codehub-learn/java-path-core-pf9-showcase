package gr.codelearn.core.showcase.maven.calculator.input;

import gr.codelearn.core.showcase.maven.calculator.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class CalculatorInputHandler {
	private static final Logger logger = LoggerFactory.getLogger(CalculatorInputHandler.class);

	public static void main(String[] args) {

		logger.info("Waiting for user's input: ");
		Scanner input = new Scanner(System.in);

		logger.info("Enter first number ");
		int firstArgument = input.nextInt();

		logger.info("Enter second number ");
		int secondArgument = input.nextInt();

		logger.info(String.format("Provided numbers are %s and %s", firstArgument, secondArgument));
		logger.info("Calculated sum of provided arguments is: " + Calculator.add(firstArgument, secondArgument));
		logger.info(
				"Calculated product of provided arguments is: " + Calculator.multiply(firstArgument, secondArgument));
	}

}
