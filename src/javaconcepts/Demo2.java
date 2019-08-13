package javaconcepts;

public class Demo2 extends Abdemo{

	
	int m;
	int n;
	public Demo2(int m,int n,int i,int j) {
		super(i,j);
		
		this.m=m;
		this.n=n;
	}
	public static void main(String[] args) {
		
		Demo2 d=new Demo2(1,2,3,4);
		// TODO Auto-generated method stub
		System.out.println(d.i+" "+d.j+" " +d.m+" "+d.n);

	}

}
