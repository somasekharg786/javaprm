package javaprograms;

public class Smallest_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 33, 55, 77, -44, 88, -66, 99, -4 };

		int largest = a[0];
		int smallest = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > largest) {
				largest = a[i]; // 99
			} else if (a[i] < smallest) {
				smallest = a[i];// -66
			}

		}
		System.out.println("the largest values is   " + largest);
		System.out.println("the smallest values is   " + smallest);
	}

}
