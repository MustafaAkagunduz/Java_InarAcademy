package chapters.Chapter3;
import java.util.Scanner;
public class C3_E33 {

	public static void main(String[] args) {
	
	Scanner scn=new Scanner (System.in);
	
	double weight1=0.0, price1=0.0, weight2=0.0, price2=0.0;
	double comparator1=0.0, comparator2=0.0;
	
	System.out.println("Enter weight and price for package 1: ");
	weight1=scn.nextDouble();
	price1 =scn.nextDouble();
	System.out.println("Enter weight and price for package 2 :");
	weight2=scn.nextDouble();
	price2 =scn.nextDouble();
	
	comparator1= weight1/price1;
	comparator2= weight2/price2;
	
	if(comparator1>comparator2) {System.out.println("Package 1 has a better price.");}
	else System.out.println("Package 2 has a better price.");
	
	scn.close();

	}

}
