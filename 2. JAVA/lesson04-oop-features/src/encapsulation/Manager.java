package encapsulation;

import encapsulation.inside.Employee;

public class Manager {
	double salary;
	protected String skills;
	
	public static void main(String[] args) {
		Employee employee = new Employee();
		System.out.println(employee.name);
	}
}
