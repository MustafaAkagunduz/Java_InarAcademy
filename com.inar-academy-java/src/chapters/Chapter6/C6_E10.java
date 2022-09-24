package chapters.Chapter6;

public class C6_E10 {

	public static void main(String[] args) {

		int cnt = 0;

		for (int i = 1; i <= 10_000; i++) {

			if (isPrime(i) == true) {
				cnt++;
			}

		}

		System.out.println("The number of prime numbers less than 10 000 is: " + cnt);

	}

	public static boolean isPrime(int number) {
		if (number == 1) {
			return false;
		}
		for (int divisor = 2; divisor <= number / 2; divisor++) {

			if (number == 2) {
				return true;
			}

			else if (number % divisor == 0) { // If true, number is not prime
				return false; // Number is not a prime
			}
		}

		return true; // Number is prime

	}

}
