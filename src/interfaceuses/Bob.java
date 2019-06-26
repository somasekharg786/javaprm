package interfaceuses;

public class Bob  extends Sbi{
	
	public void goldloan() {
		System.out.println("we povide role gold loans ");
		
		
	}
	public void marriageloan() {
		System.out.println("we provide free marrige loans");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bob b=new Bob();
		b.goldloan();
		b.marriageloan();
		Sbi sb=new Bob();
		sb.goldloan();
		sb.marriageloan();
		
	}

}
