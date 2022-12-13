package gr.codelearn.repository;

import gr.codelearn.model.Employee;

import java.math.BigDecimal;

public interface EmployeeRepository extends GeneralRepository<Employee>{

	boolean update(int employeeId, BigDecimal newSalary);
}
