package javaprograms;

public class A {
	
	public static void print(int num) {
		if(num<=10) {
		
			System.out.println(num+ " ");
			print(num + 1);
		}
	}

	public static void main(String[] args) {
		
int number=1;
print(number);
	}
}
