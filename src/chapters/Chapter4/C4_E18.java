package chapters.Chapter4;

import java.util.Scanner;

public class C4_E18 {

	public static void main(String[] args) {

		//COULD BE DONE WITH "SWITCH/CASE", I REALIZED IT LATER..
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two characters(First Major(Upper Case Please), then Status): ");
		String myStr = scn.next();
		char majorChar = myStr.charAt(0);
		char statusChar = myStr.charAt(1);
		String major="", status="";
		if (majorChar == 'M') {
			major = "Mathematics";
		} else if (majorChar == 'C') {
			major = "Computer Science";
		} else if (majorChar == 'I') {
			major = "Information Technologies";
		}

		if (statusChar == '1') {
			status = "Freshman";
		} else if (statusChar == '2') {
			status = "Sophomore";
		} else if (statusChar == '3') {
			status = "Junior";
		} else if (statusChar == '4') {
			status = "Senior";
		}

		System.out.println(major+ " "+ status);
		
		scn.close();
	}

}
