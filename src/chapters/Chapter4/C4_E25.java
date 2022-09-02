package chapters.Chapter4;

import java.util.Random;

public class C4_E25 {

	public static void main(String[] args) {
	
	Random rdn= new Random();
	
	char 	c1=(char) ((int) (Math.random()*26)+65);
	char 	c2=(char) ((int) (Math.random()*26)+65);
	char 	c3=(char) ((int) (Math.random()*26)+65);
	int  	d1=rdn.nextInt(10);
	String  digit1=Integer.toString(d1);
	int  	d2=rdn.nextInt(10);
	String  digit2=Integer.toString(d2);
	int     d3=rdn.nextInt(10);
	String  digit3=Integer.toString(d3);
	int     d4=rdn.nextInt(10);
	String  digit4=Integer.toString(d4);
	
	System.out.println("Random vehicle plate number is: "+ c1+c2+c3+digit1+digit2+digit3+digit4);
	

	}

}
