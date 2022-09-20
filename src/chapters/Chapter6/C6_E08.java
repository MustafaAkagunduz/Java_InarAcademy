package chapters.Chapter6;

public class C6_E08 {

	public static void main(String[] args) {

		System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\tCelsius");
		double celsius = 40.0, fahrenheit = 120.0;
		for (int i = 1; i <= 10; i++) {

			System.out.println(celsius + "\t\t" + ((int)(celsiusToFahrenheit(celsius)*100)/100.0) + "\t\t|\t" + fahrenheit + "\t\t"
					+ ((int)(fahrenheitToCelsius(fahrenheit)*100)/100.0));
			celsius-=1.0;
			fahrenheit -= 10.0;

		}

	}

	/** Convert from Celsius to Fahrenheit */
	public static double celsiusToFahrenheit(double celsius) {
		double fahrenheit = (9.0 / 5) * celsius + 32;
		return fahrenheit;

	}

	/** Convert from Fahrenheit to Celsius */
	public static double fahrenheitToCelsius(double fahrenheit) {

		double celsius = (5.0 / 9) * (fahrenheit - 32);
		return celsius;
	}

}
