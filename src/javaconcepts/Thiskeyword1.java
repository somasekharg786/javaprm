package javaconcepts;



public class Thiskeyword1 {
	
	void apple() {
		
		System.out.println("this apple very helpfull for health");
	}
	
	void banana() {
		
		System.out.println("this banana also very good for health");
	//this.apple();
	apple();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thiskeyword1 th=new Thiskeyword1();
		th.banana();

	}

}
