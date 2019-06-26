package javaprograms;

public class Removejunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="somasekhar19893274ddfd4937423!@#$%^&&*(()()";
          s=s.replaceAll("[^a-z0-9]", "");
          System.out.println(s);
	}

}
