package chapters.Chapter4;
import java.util.Scanner;
public class C4_E20 {

	public static void main(String[] args) {
		
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String userInput=scn.nextLine();
		System.out.println("The length of your string is: "+ userInput.length() + " and its first character is: "+ userInput.charAt(0)  );
		scn.close();
	}

}
