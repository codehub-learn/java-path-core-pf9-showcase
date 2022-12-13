package gr.codelearn.model;

import java.math.BigDecimal;
import java.util.Date;

public class Employee  {
	private String name;
	private Date dateOfBirth;
	private BigDecimal salary;
	private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(final Department department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(final Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(final BigDecimal salary) {
		this.salary = salary;
	}
}
