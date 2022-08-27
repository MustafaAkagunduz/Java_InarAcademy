package chapters.Chapter3;
import java.util.Scanner;
public class C3_E17 {

	public static void main(String[] args) {
	
	Scanner scn= new Scanner(System.in);
	
	int robot= (int)(Math.random()*3);		//CREATES A RANDOM NUMBER 0-1-2
	
	System.out.println("enter your guess--->scissor (0), rock (1), paper (2): ");
	int guess=scn.nextInt();
	
	switch(guess) {
			case 0:
				if(robot==0) {System.out.println("Draw");}
				else if(robot==1) {System.out.println("You lost..");}
				else System.out.println("You win");
				break;
			
			case 1:
				if(robot==0) {System.out.println("You win!");}
				else if(robot==1) {System.out.println("Draw");}
				else System.out.println("You lost..");
				break;
			
			case 2:
				if(robot==0) {System.out.println("You lost..");}
				else if(robot==1) {System.out.println("You win!");}
				else System.out.println("Draw");
				break;
			
			default: 
				System.out.println("invalid entry");
				break;
	
	
	
	
	} System.out.println("The computer chose "+ robot);
	
	

	scn.close();
	
	
	
	
	}

}
