package codingBat.W2;
import java.util.Scanner;
public class MAX_1020 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int temp=0;
		System.out.println("Please enter two numbers: ");
		int v1=scn.nextInt();
		int v2=scn.nextInt();
		
		if (v2 > v1) {
		    temp = v1;
		    v1 = v2;
		    v2 = temp;
		  }
		  
		  
		  if (v1 >= 10 && v1 <= 20) System.out.println(v1);
		  else if (v2 >= 10 && v2 <= 20) System.out.println(v2);
		  
		  scn.close();
		

	}

}

