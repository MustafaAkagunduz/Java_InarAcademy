package chapters.Chapter3;
import java.util.Scanner;
public class C3_E15 {

	public static void main(String[] args) {
		int number = (int) (Math.random() * 1000);
		
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your guess(3-digits): ");

        int guess = scn.nextInt();

        int numbersFirstDigit = number / 100;
        int numbersSecondDigit = number % 100;
        int numbersThirdDigit = numbersSecondDigit / 10;
        numbersSecondDigit %= 10;

        
        int guessFirst = guess / 100;
        int guessSecond = guess % 100;
        int guessThird = guessSecond / 10;
        guessSecond %= 10;

       

        System.out.println("Random number was " + number);
        String result = "";

        if (guess == number) {
            		result += "You win $10,000";
        } else if ((guessFirst == numbersFirstDigit || guessFirst == numbersSecondDigit || guessFirst == numbersThirdDigit) && (guessSecond == numbersFirstDigit || guessSecond == numbersSecondDigit || guessSecond == numbersThirdDigit)&& (guessThird == numbersFirstDigit || guessThird == numbersSecondDigit || guessThird == numbersThirdDigit)) {
            		result += "You win $3,000";

        } else if ((guessFirst == numbersFirstDigit || guessFirst == numbersSecondDigit || guessFirst == numbersThirdDigit) && (guessThird == numbersFirstDigit || guessThird == numbersSecondDigit || guessThird == numbersThirdDigit)&& (guessSecond == numbersFirstDigit || guessSecond == numbersSecondDigit || guessSecond == numbersThirdDigit)) {
            		result += "You win $3,000";

        } else if ((guessSecond == numbersFirstDigit || guessSecond == numbersSecondDigit || guessSecond == numbersThirdDigit) && (guessFirst == numbersFirstDigit || guessFirst == numbersSecondDigit || guessFirst == numbersThirdDigit)&& (guessThird == numbersFirstDigit || guessThird == numbersSecondDigit || guessThird == numbersThirdDigit)) {
            		result += "You win $3,000";

        } else if ((guessSecond == numbersFirstDigit || guessSecond == numbersSecondDigit || guessSecond == numbersThirdDigit) && (guessThird == numbersFirstDigit || guessThird == numbersSecondDigit || guessThird == numbersThirdDigit)&& (guessFirst == numbersFirstDigit || guessFirst == numbersSecondDigit || guessFirst == numbersThirdDigit)) {
        			result += "You win $3,000";

        } else if ((guessThird == numbersFirstDigit || guessThird == numbersSecondDigit || guessThird == numbersThirdDigit) && (guessFirst == numbersFirstDigit || guessFirst == numbersSecondDigit || guessFirst == numbersThirdDigit)&& (guessSecond == numbersFirstDigit || guessSecond == numbersSecondDigit || guessSecond == numbersThirdDigit)) {
        			result += "You win $3,000";

        } else if ((guessThird == numbersFirstDigit || guessThird == numbersSecondDigit || guessThird == numbersThirdDigit) && (guessSecond == numbersFirstDigit || guessSecond == numbersSecondDigit || guessSecond == numbersThirdDigit)&& (guessFirst == numbersFirstDigit || guessFirst == numbersSecondDigit || guessFirst == numbersThirdDigit)) {
        			result += "You win $3,000";

        } else if (guessFirst == numbersFirstDigit || guessFirst == numbersSecondDigit || guessFirst == numbersThirdDigit || guessSecond == numbersFirstDigit || guessSecond == numbersSecondDigit || guessSecond == numbersThirdDigit || guessThird == numbersFirstDigit || guessThird == numbersSecondDigit|| guessThird == numbersThirdDigit) {
        		    result += "You win $1,000";

        } else {result += "Play again!!!";
          }
        System.out.println(result);
        scn.close();

	}

}
