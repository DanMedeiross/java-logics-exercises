import java.util.Locale;

public class SaidaDeDados {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.print(product1);
		System.out.print(" which price is $ ");
		System.out.println(price1);
		System.out.println(product2 + ", which price is $ " + price2);
		System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender);
		System.out.println("Measure with eight decimal places: " + measure);
		System.out.printf("Rounded (three decimal places): %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f %n", measure);		
	}
}