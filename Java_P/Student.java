package javaprograms;

public class Student {
	String name;
	String add;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1=new Student();
		Student std2=new Student();
		std1.name="Supriya";
		std1.add="Bangalore";
		std2.name="Sneha";
		std2.add="Hyderabad";
		System.out.println("Name="+std1.name+" Address="+std1.add);
		System.out.println("Name="+std2.name+" Address="+std2.add);
		
	}

}
