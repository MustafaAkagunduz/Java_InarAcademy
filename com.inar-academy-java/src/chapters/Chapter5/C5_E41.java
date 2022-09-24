package chapters.Chapter5;

import java.util.Scanner;

public class C5_E41 {

	public static void main(String[] args) {
	
		Scanner scn=new Scanner(System.in);
		System.out.print("Please enter the values(enter 0 to exit): ");
		int input;
		int max=0, counter=1;
		do {
			
			input=scn.nextInt();
			
			if(input>max) { max=input; counter=1;}
			else if(input==max) { counter++; }
			
			
			
			
		}while(input!=0);
		
		System.out.println("The largest number is: "+ max);
		System.out.println("The occurance count of the largest number is: "+ counter);
		
		
		scn.close();

	}

}
