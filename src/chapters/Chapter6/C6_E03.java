package chapters.Chapter6;

public class C6_E03 {

	public static void main(String[] args) {

		int a = 4224, b = 123;

		System.out.println(a + " is palindrome?: " + isPalindrome(a));
		System.out.println(b + " is palindrome?: " + isPalindrome(b));

	}

	public static boolean isPalindrome(int number) {

		return number == reverse(number);

	}

	public static int reverse(int number) {

		String num = Integer.toString(number);
		String reversedStr = "";

		for (int i = num.length() - 1; i >= 0; i--) {

			reversedStr += num.charAt(i);

		}

		int newNumber = Integer.parseInt(reversedStr);

		return newNumber;

	}

}
