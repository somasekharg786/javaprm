package javaconcepts;

public class Encapsulations {
	
	private String name;
	private String surname;
	private int  age;
	
	
	
	

	public Encapsulations(int age) {
		// TODO Auto-generated constructor stub
		this.age=age;
	}



	public String getname() {
		return name;
		
	}
	public String getsurname() {
		return surname;
	}
	public int getage() {
		return age;
	}
	
	public void setname(String Newname) {
		
		name=Newname;
	}
	
	public void setsurname(String newsurname) {
		surname=newsurname;
	}
	
	public void setage(int age) {
	this.age=age;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Encapsulations ep=new Encapsulations(23);
		ep.setname("somasekhar");
		ep.setsurname("ganapuram");
		//ep.setage(22);
		System.out.println("age of guy  "+ep.age+ " name of guy  " +ep.getname()+ " name of guy   " +ep.surname);
		
	}

}
