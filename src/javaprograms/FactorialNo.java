package javaprograms;

public class FactorialNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int factorialnum = 9;
		for (int i = (factorialnum - 1); i > 1; i--) {

			factorialnum = factorialnum * i;
		}

		System.out.println(factorialnum);
	}

}
