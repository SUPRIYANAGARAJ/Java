package javaprograms;

interface Addable{
	long add(long a, long b);
}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Multiple parameters in lambda expression
		Addable ad1=(a,b)->(a+b);
		System.out.println(ad1.add(10, 20));
		
		//Multiple parameters with datatype in lambda expression
		Addable ad2=(long a,long b)->(a+b);
		System.out.println(ad2.add(100, 200));

	}

}
