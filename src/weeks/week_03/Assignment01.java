package weeks.week_03;
import java.util.Scanner;
public class Assignment01 {

	public static void main(String[] args) {
	
		/*A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
		Ask user for their salary and year of service and print the net bonus amount.*/
		
		Scanner scn=new Scanner(System.in);
		int userYear=0; 
		double userSalary=0.0, bonus=0.0;
		
		System.out.println("Please enter your year of service: ");
		userYear=scn.nextInt();
		System.out.println("Please enter your salary: ");
		userSalary=scn.nextDouble();
		
			if(userYear>5){
				
				bonus+=(userSalary/100)*5;  
				
			}
		
			System.out.println("Your bonus amount is: $"+ bonus);
		
		scn.close();
	}

}
