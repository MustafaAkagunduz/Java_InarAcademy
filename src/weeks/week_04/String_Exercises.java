package weeks.week_04;

/*equalsIgnoreCase(): Compares two strings ignoring case differences.
 * 
 * contains(): Checks if a string contains a substring.
 * 
 * trim(): Returns thesubstring after removing any leading and trailing
 * whitespace from the specified string.
 * 
 * charAt(): Returns the character at specified index.
 * 
 * toLowerCase(): Converts string characters to lower case.
 * 
 * toUpperCase():Converts string characters to upper case. concat():
 * Concatenates two strings.
 * 
 * split(): Split/divide the string at the specified regex.
 * 
 * compareTo():Compares two strings on the basis of the Unicode value of each
 * string character.
 * 
 * compareToIgnoreCase(): Similar to compareTo, but it also ignores case
 * differences.*/

public class String_Exercises {

	public static void main(String[] args) {

		System.out.println("Length:");

		length();
		System.out.println("----------------------");
		System.out.println("Substring:");

		substring();
		System.out.println("----------------------");
		System.out.println("EqualsIgnoreCase:");

		equalsIgnoreCase();
		System.out.println("----------------------");
		System.out.println("Contains:");

		contains();
		System.out.println("----------------------");
		System.out.println("Trim:");
		
		trim();
		System.out.println("----------------------");
		System.out.println("CharAt:");
		
		charAt();
		System.out.println("----------------------");
		System.out.println("toLowerCase:");
		
		toLowerCase();
		System.out.println("----------------------");
		System.out.println("toUpperCase:");
		
		toUpperCase();

		
		/*
		 * split(); System.out.println("----------------------"); compareTo();
		 * System.out.println("----------------------"); compareToIgnoreCase();
		 * System.out.println("----------------------");
		 */
	}

	public static void length() {

		String temp = "I Love Inar Academy";
		System.out.println(temp.length());

	}

	public static void substring() {

		String temp = "Inar Academy";
		String yeni = temp.substring(3, 9);
		System.out.println("Old " + temp + " New: " + yeni);

	}

	public static void equalsIgnoreCase() {

		String a = "asd";
		String b = "fgh";
		System.out.println("İki string'im eşit mi: " + a.equalsIgnoreCase(b));

	}

	public static void contains() {

		String name = "Akagündüz";
		String name2 = "Aka";
		System.out.println("İlk string ikincisini içeriyor mu: " + name.contains(name2));

	}

	public static void trim() {
		String str = "   Aka   ";
		String str2 = str.trim();
		System.out.println("Before: " + str + "\nAfter: " + str2);

	}

	public static void charAt() {

		String name = "Mustafa";
		System.out.println("Stringin ilk karakteri: " + name.charAt(0));

	}

	public static void toLowerCase() {

		String str = "INAR";
		System.out.println("Before: " + str + "\nAfter: " + str.toLowerCase());

	}

	public static void toUpperCase() {

		String str = "inar";
		System.out.println("Before: " + str + "\nAfter: " + str.toUpperCase());

	}

	public static void split() {
		// sonra

	}

	public static void compareTo() {
		// sonra

	}

	public static void compareToIgnoreCase() {
		// sonra

	}

}
