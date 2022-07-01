
public class FizzBuzz {
	public static void main(String[] args) {
		int number = 0;
		while (number <= 99) {
			number++;
			if (number % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (number % 5 == 0) {
				System.out.println("Buzz");
			} else if (number % 3 == 0) {
				System.out.println("Fizz");
			} else {
				System.out.println(number);
			}
		}
	}
}
/*
 * if (number % 15 == 0) { System.out.println("fizzbuzz"); } else if (number % 5
 * == 0) { System.out.println("buzz"); } else if (number % 3 == 0) {
 * System.out.println("fizz")
 */