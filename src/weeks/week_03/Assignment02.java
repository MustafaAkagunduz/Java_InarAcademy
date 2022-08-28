package weeks.week_03;
import java.util.Scanner;
public class Assignment02 {

	public static void main(String[] args) {
	
	// Question 2: Take input of age of 3 people by user and determine oldest and youngest among them.

	Scanner scn=new Scanner(System.in);
	int p1,p2,p3,oldest,youngest;
	
	System.out.println("Please enter the age of three people: ");
	System.out.println("Person 1: ");
	p1=scn.nextInt();
	System.out.println("Person 2: ");
	p2=scn.nextInt();
	System.out.println("Person 3: ");
	p3=scn.nextInt();
	
	if			(p1>p2 && p1>p3) { oldest=p1;}
	else if		(p2>p1 && p2>p3) { oldest=p2;}
	else 						   oldest=p3;
	
	
	if			(p1<p2 && p1<p3) { youngest=p1;}
	else if		(p2<p1 && p2<p3) { youngest=p2;}
	else 						   youngest=p3;
	
	
	System.out.println("Oldest   person is, who has: "+ oldest +   " years..");
	System.out.println("Youngest person is, who has: "+ youngest + " years..");
	
	
	
	scn.close();
	}

}
