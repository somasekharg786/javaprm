package javaprograms;

public class Printnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 1;

		printNumbers(number);
	}

	public static void printNumbers(int num) {
		if (num <= 10) {
			System.out.print(num + " ");
			printNumbers(num + 1);
		}

	}
}
