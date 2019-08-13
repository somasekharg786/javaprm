package javaprograms;

public class Permutation {

public String swap(String a,int i,int j) {
	char temp;
	
	char ch[]=a.toCharArray();
	
	temp=ch[i];
	ch[i]=ch[j];
	ch[j]=temp;
	return String.copyValueOf(ch);
}

private void permute(String str,l,r) {
	if(l=r) {
		System.out.println(str);
	}else {
		for(int i=l;i<=r;i++) {
			str=swap(str,l,i);
			swap(str,l+1,n);
			swap(str,l,i);
			
		}
	}
}
public static void main(String args[]) {
	String str="ABC";
	int n=str.length();
	Permutation p=new Permutation();
	p.permute(str,0,n-1);
	
}
	
}
