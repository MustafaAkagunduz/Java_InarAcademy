package chapters.Chapter4;

import java.util.Scanner;

public class C4_E17 {

	public static void main(String[] args) {
	
		Scanner scn= new Scanner(System.in);
		System.out.println("Please input a year: ");
		int year=scn.nextInt();
		System.out.println("Please enter the first three letters of a month");
		String month=scn.next();
		
		switch (month){
		case "Jan": 				System.out.println(month+ " "+ year + " has 31 days.."); 		break;
		case "Feb": if(year%4==0) { System.out.println(month+ " "+ year + " has 29 days..");		break; 
					} else 			System.out.println(month+ " "+ year + " has 28 days.."); 		break;
		case "Mar": 				System.out.println(month+ " "+ year + " has 31 days.."); 		break;
		case "Apr": 				System.out.println(month+ " "+ year + " has 30 days.."); 		break;
		case "May": 				System.out.println(month+ " "+ year + " has 31 days.."); 		break;
		case "Jun": 				System.out.println(month+ " "+ year + " has 30 days.."); 		break;
		case "Jul": 				System.out.println(month+ " "+ year + " has 31 days.."); 		break;
		case "Aug": 				System.out.println(month+ " "+ year + " has 31 days.."); 		break;
		case "Sep": 				System.out.println(month+ " "+ year + " has 30 days.."); 		break;
		case "Oct": 				System.out.println(month+ " "+ year + " has 31 days.."); 		break;
		case "Nov": 				System.out.println(month+ " "+ year + " has 30 days.."); 		break;
		case "Dec": 				System.out.println(month+ " "+ year + " has 31 days.."); 		break;
		default   : 				System.out.println("Invalid input, please try again later..."); break;
		
		
		
		}
		
		
		
		scn.close();
		

	}

}
