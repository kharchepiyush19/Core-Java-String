package basics;

public class SortNumString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="154646";
		char[] a=s.toCharArray();
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					char t=a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
			}
		}
			for(char i:a) {
				System.out.print((char)i+" ");
			}
		
	}

}
