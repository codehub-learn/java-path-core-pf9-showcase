package gr.codelearn.service;

import gr.codelearn.model.Department;
import gr.codelearn.model.Employee;
import gr.codelearn.repository.GeneralRepository;
import gr.codelearn.repository.GeneralRepositoryImpl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class HrService {
	private	GeneralRepository<Employee> employeeRepository = new GeneralRepositoryImpl<>();
	private	GeneralRepository<Department> departmentGeneralRepository = new GeneralRepositoryImpl<>();
	private  Scanner scanner = new Scanner(System.in);

	public void createDepartment(){
			System.out.println("Please give the name of the new department");
			String name = scanner.next();
			Department department = new Department();
			department.setName(name);
			departmentGeneralRepository.createT(department);
	}

	public void createEmployees(){
		for (int i=0;i<3 ;i++) {
			Employee employee = new Employee();
			System.out.println("Please give the name of the new customer");
			String name = scanner.next();
			employee.setName(name);
			employee.setDepartment(departmentGeneralRepository.readT(0));
			System.out.println("Please give dob format yyyy-mm-dd");
			String dateOfBirth = scanner.next();
			try {
				Date dob = parseDate(dateOfBirth);
				employee.setDateOfBirth(dob);
			}
			catch(Exception e){
				System.out.println("date conversion error");
			}
			employeeRepository.createT(employee);
		}
	}


	public void manageEmployees(){

		System.out.println("Please gine the index of the requested customer 0-2");
		int index = scanner.nextInt();
		Employee employee = employeeRepository.readT(index);
		try {
			System.out.println("name = " + employee.getName()
									   + " department = " + employee.getDepartment()
									   +" dob = " +employee.getDateOfBirth());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

		System.out.println(employeeRepository.readT());

		ArrayList<Employee> emps = employeeRepository.readT();


		emps.clear();

		System.out.println(employeeRepository.readT());
	}


	public void termination(){

		System.out.println("Program termination");
	}

	/**
	 * @param dateOfBirth  yyyy-mm-dd
	 * @return Date object
	 */
	private static Date parseDate(String dateOfBirth) throws Exception {
		String []words=dateOfBirth.split("-");
		int year = Integer.parseInt(words[0]);
		int month = Integer.parseInt(words[1]);
		int day = Integer.parseInt(words[2]);
		Date date = new Date(year-1900, month-1, day);
		return date;
	}




}
