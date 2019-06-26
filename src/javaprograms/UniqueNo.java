package javaprograms;

import java.util.ArrayList;

public class UniqueNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] s = { 1, 3, 4, 6, 7, 5, 1, 1, 3, 3, 4, 4, 6, 6, 7 };

		ArrayList<Integer> ab = new ArrayList<Integer>();

		for (int i = 0; i < s.length; i++) {
			int count = 0;
			if (!ab.contains(s[i])) {

				ab.add(s[i]);

				count++;
				for (int j = i + 1; j < s.length; j++) {
					if (s[i] == s[j]) {

						count++;
					}
				}
				
				System.out.println(s[i]+" --  "+count);
				
			}
			
		}
		

	}

}
