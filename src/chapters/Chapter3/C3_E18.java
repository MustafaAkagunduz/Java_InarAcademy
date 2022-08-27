package chapters.Chapter3;
import java.util.Scanner;
public class C3_E18 {

	public static void main(String[] args) {
	
	Scanner scn=new Scanner(System.in);
	
	System.out.println("Enter the weight of your package");
	double weight=scn.nextDouble();
	
	if(weight>0 && weight<=1) {System.out.println("The cost is: $3.5");}
	else if(weight>1 && weight<=3) {System.out.println("The cost is: $5.5");}
	else if(weight>3 && weight<=10) {System.out.println("The cost is: $8.5");}
	else if(weight>10 && weight<=20) {System.out.println("The cost is: $10.5");}
	else System.out.println("the package cannot be shipped...");
	
	scn.close();
	}

}
