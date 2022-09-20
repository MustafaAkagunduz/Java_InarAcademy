package chapters.Chapter5;

import java.util.Random;

public class C5_E40 {

	public static void main(String[] args) {

		Random rdm = new Random();
		int heads = 0, tails = 0;

		for (int i = 1; i <= 1_000_000; i++) {
			int randomInt = rdm.nextInt(2);

			if (randomInt == 0) {
				heads++;
			} else
				tails++;

		}
		System.out.println("Number of heads: " + heads);
		System.out.println("Number of tails: " + tails);
		System.out.println("Total flipping: " + (heads + tails));

	}

}
