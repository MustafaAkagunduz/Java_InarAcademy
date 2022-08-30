package chapters.Chapter3;

import java.util.Random;

public class C3_E16 {

	public static void main(String[] args) {

		Random r= new Random();
		
        int isXnegative = r.nextInt(2); // if "1" comes from here; I will convert the random number to negative for x 
        int isYnegative = r.nextInt(2); // if "1" comes from here; I will convert the random number to negative for y 
        
        System.out.println(isXnegative);
        System.out.println(isYnegative);
        int x = (int) ((Math.random() * 50));
        int y = (int) ((Math.random() * 100));


        if (isXnegative==1) { x = x * -1;
        } 

        if (isYnegative==1) { y = y * -1;
        } 

        System.out.println("(" + x + "," + y + ")");
    }
}
