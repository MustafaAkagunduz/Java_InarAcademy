package chapters.Chapter3;
import java.util.Scanner;
public class C3_E21 {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);

        System.out.println("Enter year: (e.g., 2012): ");
        int year = scn.nextInt();

        System.out.println("Enter month: 1-12: ");
        int month = scn.nextInt();

        int m;
        if (month == 1) { m = 13; year -= 1;
        } else if (month == 2) { m = 14; year -= 1;   
        } else m = month;
            
        int k = year % 100;
        int j = year / 100;

        System.out.println("Enter the day of the month: 1-31:");
        int q = scn.nextInt();
        
        //Required computation
        int h = ((q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j))) % 7;

        String day = "";

        switch (h) {
            case 0: day += "Saturday";  break;
            case 1: day += "Sunday";    break;
            case 2: day += "Monday";    break;   
            case 3: day += "Tuesday";   break;    
            case 4: day += "Wednesday"; break;
            case 5: day += "Thursday";  break;   
            case 6: day += "Friday"; 	break; 
            
            
        }
      System.out.println("Day of the week is: " + day);
      scn.close();	

	}

}
            
                
                

            
  
