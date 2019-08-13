package javaprograms;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x[]= {"somasekhar","sekhar","sekhar","somaskehar"};
		
		for(int i=0;i<x.length;i++) {
			for(int j=i+1;j<x.length;j++) {
				if((x[i].equals(x[j]))) {
					
					System.out.println(x[i]);
				}
			
			}
			
		}
	
	}

}
