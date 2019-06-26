package javaprograms;

public class ArmastrongNumber {
	
	 public static void isArmstrongNumber(int num){
		  //153 ==  1*1*1    5*5*5      3*3*3
		System.out.println("given number is " + num);
		int cube = 0;
		int r;
		int t;
		t = num;

		while (num > 0) {
			r = num % 10; // 5
			num = num / 10;// 5
			cube = cube + (r * r * r);// 27+25
		}

		if (t == cube) {
			System.out.println("this is an armstrong number");
		} else {
			System.out.println("this is not an armstrong number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  isArmstrongNumber(153);
		  isArmstrongNumber(370);
		  isArmstrongNumber(0);
		  isArmstrongNumber(1);
		  isArmstrongNumber(455);

	}

}
