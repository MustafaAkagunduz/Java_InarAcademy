package chapters.Chapter6;

public class C6_E26 {

	public static void main(String[] args) {

		firstHundredPalPrim();

	}

	public static void firstHundredPalPrim() {

		int lineCounter = 1;
		int count = 1;
		int printed = 1;
		boolean isPrint = true;
		while (count <= 100) {

			isPrint = isPrime(printed) && isPalindrome(printed);
			if (isPrint == false) {
				printed++;
				continue;
			} else if (isPrint == true) {

				System.out.print(printed + "\t");
				printed++;
				count++;

			}

			lineCounter++;
			if (lineCounter == 11) {
				System.out.println();
				lineCounter = 1;
			}

		}

	}

	public static boolean isPalindrome(int a) {

		boolean isPalindrome = true;
		String num = Integer.toString(a);

		for (int i = 0; i < num.length() / 2; i++) {

			if (num.charAt(i) != num.charAt(num.length() - 1 - i))
				isPalindrome = false;

		}

		return isPalindrome;
	}

	public static boolean isPrime(int num) {

		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}

		}
		if (num == 1)
			isPrime = false;
		return isPrime;
	}
}
