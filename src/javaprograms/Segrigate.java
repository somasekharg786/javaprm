package javaprograms;

public class Segrigate {
	
	public static void main(String[] args) {
		
		int arr[]= {0,1,0,1,0,1,0,1,0,1,0,1,0};
		
		int count=0;
		
		for( int i=0;i<arr.length;i++) {
			
			if(arr[i]==0)
			{
				arr[count++]=arr[i];
				
			}
		}
		while(count<arr.length) {
			arr[count++]=1;
		}
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}
	}
}


