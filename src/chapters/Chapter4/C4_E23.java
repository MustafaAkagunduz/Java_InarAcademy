package chapters.Chapter4;
import java.util.Scanner;
public class C4_E23 {

	public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	
	System.out.print("Enter employee's name: ");
	String name=scn.nextLine();
	System.out.print("Enter number of hours worked in a week: ");
	double hour=scn.nextDouble();
	System.out.print("Enter hourly pay rate: ");
	double hourlyPay=scn.nextDouble();
	System.out.print("Enter federal tax withholding rate: ");
	double federalRate=scn.nextDouble();
	System.out.print("Enter state tax withholding rate: " );
	double stateRate=scn.nextDouble();
	System.out.println();
	System.out.println("Employee Name:"+ name);
	System.out.println("Hours Worked: "+ hour);
	System.out.println("Pay Rate: $"+ hourlyPay);
	System.out.println("Gross Pay: $"+ hour * hourlyPay);
	
	double gross= hour*hourlyPay;
	
	System.out.println("Deductions");
	System.out.println("	Federal Withholding (20.0%): $"+ (gross*federalRate));
	System.out.println("	State Withholding(9.0%): $"+ (gross*stateRate));
	System.out.println("	Total Deduction: $"+ (gross*federalRate+(gross*stateRate)) );
	System.out.println("Net Pay: $"+ (gross-(gross*federalRate+(gross*stateRate))));
	
	
	
	
	scn.close();
	}

}
