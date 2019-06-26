package javaconcepts;

public class Finalvarialble {
	
	final static String name;
	static {
		name="sekhar";
	}
	
	
	void display() {
	
		System.out.println("ahifdsfhklf   " +name);
	}

	public static void main(String[] args) {
		
		Finalvarialble fs=new Finalvarialble();
		fs.display();
		// TODO Auto-generated method stub

	}

}
