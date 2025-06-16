package entities;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	
	// ASSOCIAÇÃO 1 PRA 1
	private Department department;
}
