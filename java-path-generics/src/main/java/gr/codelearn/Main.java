package gr.codelearn;

import gr.codelearn.service.HrService;

public class Main {
	public static void main(String[] args) {
		HrService hrService = new HrService();
		hrService.createDepartment();
		hrService.createEmployees();
		hrService.manageEmployees();
		hrService.termination();
	}
}
