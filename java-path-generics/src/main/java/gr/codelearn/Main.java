package gr.codelearn;

import gr.codelearn.model.Employee;
import gr.codelearn.repository.EmployeeRepository;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		EmployeeRepository employeeRepository = new EmployeeRepository();
		Scanner scanner = new Scanner(System.in);
		for (int i=0;i<3 ;i++) {
			Employee employee = new Employee();
			System.out.println("Please gine the name of the new customer");
			String name = scanner.next();
			employee.setName(name);
			employeeRepository.createEmployee(employee);
		}

		System.out.println("Please gine the index of the requested customer 0-2");
		int index = scanner.nextInt();
		Employee employee = employeeRepository.readEmployee(index);
		System.out.println("name = " +employee.getName() +" department = " + employee.getDepartment());





	}
}
