package codingBat.W2;
import java.util.Scanner;
public class CLOSE_10 {

	public static void main(String[] args) {
		
		  Scanner scn=new Scanner(System.in);
		  System.out.println("enter two values: ");
		  int v1res=0, v2res=0;
		  
		  int v1=scn.nextInt();
		  v1res = Math.abs(v1 - 10);
		  
		  int v2=scn.nextInt(); 
		  v2res = Math.abs(v2 - 10);
		  
		  if (v1res < v2res) {
		    System.out.println(v1+ " is the closest to 10");
		  }
		  if (v2res < v1res) {
		    System.out.println(v2+ " is the closest to 10");
		  }
		  scn.close();
		}

}
