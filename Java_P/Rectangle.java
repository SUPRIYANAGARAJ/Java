package javaprograms;

class rr {
    int le;
    int br;
    
    public rr(int le, int br) {
		super();
		this.le = le;
		this.br = br;
	}

    public int area()
    {
        return le * br;
    }
}

public class Rectangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        rr obj = new rr(10,15);
		        rr obj1 = new rr(16,13);

		        System.out.println(obj.area());
		        System.out.println(obj1.area());

	}

}
