package javaprograms;

public class IndexDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] colors= {"Red","Black","Blue","Yellow"};
		int index=0;
		for(int i=0;i<colors.length;i++) {
			if(colors[i]=="Blue") {
				index=i;
			}
		}
		System.out.println("Index:"+index);

	}

}
