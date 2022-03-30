package javaprograms;

import java.util.Scanner;

public class AvgVal {

	public static void main(String[] args) {
    int a[]=new int[5];
    double sum = 0, avg = 0;

     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the array elements:");

      for(int i=0;i<a.length;i++)
      {
	     a[i]=sc.nextInt();
      }
        for(int i=0;i<a.length;i++)
        {
		sum=sum+a[i];
	    }

          avg=(sum/a.length);

          System.out.println("Sum :" +sum);
          System.out.println("Average value:"+avg);


}

}

