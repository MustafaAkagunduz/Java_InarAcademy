package chapters.Chapter6;

public class C6_E23 {

	public static void main(String[] args) {

		System.out.println(count("Mustafa", 'a'));

	}

	public static int count(String str, char a) {

		int counter = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == a)
				counter++;

		}

		return counter;
	}

}
