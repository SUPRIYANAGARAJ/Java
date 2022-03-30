package javaprograms;

public class Area {
	
	int length, breadth;
			
	public Area(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public int setDim() {
		int results = length*breadth;
		return results;
	}
	
	public void getArea() {
		System.out.println("Area = " + setDim());
	}
	
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
    	Area x = new Area(4,6);
    	x.getArea();

	}

}
