package javaprograms;

import java.util.Scanner;

public class Employee1 {
	
	double sal,hours;
	
	
	public void getInfo(double sal, double hours) {
		
		this.sal = sal;
		this.hours = hours;
		
	}

	public void addSal() {
		if(sal<500){
			sal = sal +10;
			System.out.println("Final Salary of the employee:" +sal);
		}
	}
	
	public void addWork() {
		if(hours>6) {
			sal = sal+5;
			System.out.println("Final Salary of the employee:" +sal);
		}
	}
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary");
		double sal = sc.nextDouble();
		System.out.println("Enter the no.of working hours");
		double hours = sc.nextInt();
		
		Employee1 obj = new Employee1();
		obj.getInfo(sal,hours);
		obj.addSal();
		obj.addWork();
		
		

	}

}
