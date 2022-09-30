package chapters.Chapter6;

public class C6_E20 {

	public static void main(String[] args) {


		System.out.println(countLetters("Aka123456aka")); //"6" expected..

	}

	public static int countLetters(String s) {

		int numOfLetters = 0;
		char ch;
		for (int i = 0; i < s.length(); i++) {
			ch = s.charAt(i);
			if (Character.isLetter(ch)) {
				numOfLetters++;
			}

		}

		return numOfLetters;
	}

}
