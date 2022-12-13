package gr.codelearn.repository;

import gr.codelearn.model.Employee;

import java.math.BigDecimal;

public class EmployeeRepositoryImpl extends GeneralRepositoryImpl<Employee> implements EmployeeRepository {
	@Override
	public boolean update(int employeeId,  BigDecimal newSalary) {
		Employee employee = readT(employeeId);
		if (employee == null) return false;
		employee.setSalary(newSalary);
		return true;
	}
}
