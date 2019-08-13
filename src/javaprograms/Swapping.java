package javaprograms;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the x value");
		
				int x=sc.nextInt();
				Scanner sc1=new Scanner(System.in);
				System.out.println("Enter the y value");
				int y=sc1.nextInt();
				
				System.out.println("the value of x and y are " +x);
				System.out.println("the value of x and y are " +y);
				
				x=x+y;
				y=x-y;
				x=x-y;
				
				System.out.println("the value of x "+x);
				System.out.println("the value of Y "+y);
				

	}

}
