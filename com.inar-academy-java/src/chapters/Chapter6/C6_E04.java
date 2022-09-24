package chapters.Chapter6;

public class C6_E04 {

	public static void main(String[] args) {

		int a = 123456;

		System.out.print("Number is: " + a + " and reversed form of the given number is: ");
		reverse(a);

	}

	public static void reverse(int number) {

		String numStr = Integer.toString(number);
		String reversed = "";

		for (int i = numStr.length() - 1; i >= 0; i--) {

			reversed += numStr.charAt(i);

		}

		System.out.println(reversed);
	}

}
