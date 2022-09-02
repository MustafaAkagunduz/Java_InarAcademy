package chapters.Chapter4;
import java.util.Scanner;
public class C4_E15 {

	public static void main(String[] args) {
		
	Scanner scn=new Scanner(System.in);
	
	System.out.println("Enter a letter: ");
	String input=scn.next();
	input=input.toLowerCase();
	
	if("abc".contains(input))       {System.out.println("The corresponding number is 2");}
	else if("def".contains(input))  {System.out.println("The corresponding number is 3"); }
	else if("ghi".contains(input))  {System.out.println("The corresponding number is 4"); }
	else if("jkl".contains(input))  {System.out.println("The corresponding number is 5"); }
	else if("mno".contains(input))  {System.out.println("The corresponding number is 6"); }
	else if("pqrs".contains(input)) {System.out.println("The corresponding number is 7"); }
	else if("tuv".contains(input))  {System.out.println("The corresponding number is 8"); }
	else if("wxyz".contains(input)) {System.out.println("The corresponding number is 9"); }
	else							 System.out.println(input+ " is an invalid input...");
	
	
	scn.close();
	}

}

// The corresponding number is: 2 (for A/a)