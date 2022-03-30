package javaprograms;

import java.util.Scanner;

public class Emp {
	
	private int employeeID;
	private String employeeName;
	private double basicSalary;
	private double specialAllowance;
	private double hra;
	private double ta;
	private double tax = 2500;
	private double netSalary;
	private String designation;

	public Emp(int employeeID, String employeeName, double basicSalary, double hra, String designation) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.designation = designation;
	}

	// method used to calculate net salary 
	public void calculateNetSalary() {

		
		if (designation == "Manager") {
			ta = (20 / 100) * basicSalary;
			specialAllowance = 20_000;
		} else {
			ta = (15 / 100) * basicSalary;
			specialAllowance = 12_000;
		}
		
		// calculating net salary
		netSalary = basicSalary + hra + specialAllowance + ta - tax;
		System.out.println("The net salary is : " + netSalary);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String designation = " ";
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter your employee ID:: ");
		int eid = sc.nextInt();
		System.out.println("Please enter your name:: ");
		String name = sc.next();
		System.out.println("Please enter your basic salary:: ");
		float basicSalary = sc.nextFloat();
		System.out.println("Please enter your HRA:: ");
		float HRA = sc.nextFloat();
		
		int x = 1;
		while (x != 0) {
			System.out.println("Select the option:\n1. Manager\n2. Assistant Manager: ");
			int option = sc.nextInt();
			
			switch (option) {
				case 1: {
					designation = "Manager";
					x=0;
					break;
				}
				case 2: {
					designation = "Assistant Manager";
					x=0;
					break;
				}
				default: {
					System.out.println("Invalid Option");
				}
			}
		}
		Emp employee = new Emp(eid, name, basicSalary, HRA, designation);
		
		employee.calculateNetSalary();
	}
}
