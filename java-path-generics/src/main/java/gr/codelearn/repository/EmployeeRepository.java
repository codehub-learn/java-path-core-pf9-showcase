package gr.codelearn.repository;

import gr.codelearn.model.Employee;

import java.math.BigDecimal;
import java.util.ArrayList;

public class EmployeeRepository {
	private ArrayList<Employee> employees;


	public EmployeeRepository(){
		employees = new ArrayList<>();
	}
	//CRUD  create read update delete

	public void createEmployee(Employee employee){
		employees.add(employee);
	}

	/**
	 * @param index of the requested Employee
	 * @return the Employee object
	 */
	public Employee readEmployee(int index){
		if(index>=0 && index<employees.size())
		return employees.get(index);
		else
			return null;
	}

	public boolean updateEmployee(int employeeIndex, BigDecimal newSalary){
		Employee employee = readEmployee(employeeIndex);
		if (employee == null ) return false;
		employee.setSalary(newSalary);
		return true;
	}

	public boolean deleteEmployee(int employeeIndex){
		Employee employee = readEmployee(employeeIndex);
		if (employee == null ) return false;
		employees.remove(employeeIndex);
		return true;
	}

}
