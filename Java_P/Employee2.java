package javaprograms;

import java.util.Scanner;

public class Employee2 {
	
	int eid;
	String ename;
	String address;
	
	 public Employee2(int eid, String ename, String address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.address = address;
	}
	 
	 public void displayEmployee() {
		 System.out.println("EID:"+eid+" ENAME:"+ename+" Address:"+address);
		 
	 }
     	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter EID");
		int id = sc.nextInt();
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Address");
		String add = sc.next();
		
		System.out.println("Enter EID");
		int id1 = sc.nextInt();
		System.out.println("Enter Name");
		String name1 = sc.next();
		System.out.println("Enter Address");
		String add1 = sc.next();
		
		Employee2 emp = new Employee2(id,name,add);
		emp.displayEmployee();
		Employee2 emp1 = new Employee2(id1,name1,add1);
		emp1.displayEmployee();
		
		
	}
}


