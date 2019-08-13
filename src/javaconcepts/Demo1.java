package javaconcepts;

public class Demo1  extends Abdemo{
	int k;
	int l;
	
	public Demo1(int k,int l,int i,int j) {
		super(i,j);
		this.k=k;
		this.l=l;
	}
	public static void main(String[] args) {
		Demo1 d=new Demo1(5,6,7,8);
		System.out.println(d.i+" "+d.j+" " +d.k+" "+d.l);
	}

}
