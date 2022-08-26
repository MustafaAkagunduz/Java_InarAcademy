package chapters.Chapter2;
import java.util.Scanner;
public class C2E_15{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
	double x1=0.0, x2=0.0, y1=0.0, y2=0.0;        

	System.out.println("Please enter x1 and y1: ");
        x1 = scn.nextDouble();
        y1 = scn.nextDouble();

        System.out.println("Please enter x2 and y2: ");
	x2 = scn.nextDouble();
        y2 = scn.nextDouble();

	//Required calculations...
        double xxx = Math.pow((x2 - x1),2);
        double yyy = Math.pow((y2 - y1),2);
	double distance = Math.pow((xxx + yyy), 5/10);

        System.out.println("The distance is " + distance);
	scn.close();


    }

}
