package chapters.Chapter3;
import java.util.Scanner;
public class C3_E30 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

        System.out.println("Enter the time zone offset to GMT:(+3 for Istanbul) ");
        int offset = scn.nextInt();
        boolean pm = false;

        long milliSeconds = System.currentTimeMillis();
        long millisToSeconds = milliSeconds / 1000;
        long seconds = millisToSeconds % 60;
        long millisToMinutes = millisToSeconds / 60;
        long minute = millisToMinutes % 60;
        long minutesToHours = millisToMinutes / 60;

       

        long hours = minutesToHours % 24;
        hours += offset;

        
        System.out.println("Your current time is " + hours + ":" + minute + ":" + seconds);
	

	}

}
