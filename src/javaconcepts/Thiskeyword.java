package javaconcepts;

public class Thiskeyword {
	
	int age=54;
	int employee_id=880;
	String name="sfdfdsfffdfdf";
	String gf;
	Thiskeyword(int age, int employee_id,String name){
		
		this.age=age;
		this.employee_id=employee_id;
		this.name=name;
		
	}
	
	Thiskeyword(int age, int employee_id,String name,String gf){
		this(age,employee_id,name);
		this.gf=gf;
	}
	void display() {
		System.out.println(age+" "+employee_id+" "+name+" "+gf);
	}
	

	public static void main(String[] args) {
		
		
	Thiskeyword th=new Thiskeyword(21,88,"somasekhar");
	Thiskeyword th1=new Thiskeyword(22,89,"sofasfdkhsdf");
	Thiskeyword th2=new Thiskeyword(22,89,"sundareswar","shilaja");
	th.display();
	th1.display();
	th2.display();

	}

}
