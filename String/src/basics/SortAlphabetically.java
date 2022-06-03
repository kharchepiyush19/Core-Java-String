package basics;

public class SortAlphabetically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"i","am","fine"};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i].compareToIgnoreCase(a[j])>0) {
					String t=a[i];
					a[i]=a[j];
					a[j]=t;
				}	
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}


	}
}