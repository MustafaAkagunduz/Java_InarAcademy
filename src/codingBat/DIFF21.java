package codingBat;
import java.util.Scanner;
public class DIFF21 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a value");
		int n=scn.nextInt();
		if (n <= 21) {
		    System.out.println(21-n);
		  } else {
		    System.out.println((n - 21) * 2);
		  }
		scn.close();

	}

}
