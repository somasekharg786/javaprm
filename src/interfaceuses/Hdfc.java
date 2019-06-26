package interfaceuses;

public class Hdfc implements Rbi {
	
	
	public void goldloan() {
		System.out.println("we povide gold loans ");
		
		
	}
	public void marriageloan() {
		System.out.println("we provide marrige loans");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hdfc hd=new Hdfc();
		hd.goldloan();
		hd.marriageloan();
		Rbi rb=new Hdfc();
		rb.intrestrate();
		rb.loans();
		rb.reporate();
		
		
		
	}
	@Override
	public void intrestrate() {
		// TODO Auto-generated method stub
		System.out.println("hi");
	}
	@Override
	public void loans() {
		// TODO Auto-generated method stub
		System.out.println("how");
	}
	@Override
	public void reporate() {
		// TODO Auto-generated method stub
		System.out.println("u");
	}
	

	

}
