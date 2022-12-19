package gr.codelearn.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Transaction {
	private int id;
	private Category category;
	private double value;
	private int quantity;
}
