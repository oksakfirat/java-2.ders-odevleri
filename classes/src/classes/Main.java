package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Delete();
		customerManager.Update();

		// value değer tipler
		int number1 = 10;
		int number2 = 40;
		number2 = number1;
		number1 = 50;
		System.out.println(number2);

		// diziler referans tutucudur.
		int[] numbers1 = new int[] { 1, 2, 3 };
		int[] numbers2 = new int[] { 4, 5, 6 };
		numbers2 = numbers1;
		numbers1[0] = 30;
		System.out.println(numbers2[0]);

	}

}