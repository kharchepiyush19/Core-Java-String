package basics;

public class ReverseEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i am fine";
		String []sa=s.split(" ");
		
		for (int i = 0; i < sa.length; i++) {
			String s1=sa[i];
			String s2="";
			
			for (int j = s1.length()-1; j >=0; j--) {
				s2=s2+s1.charAt(j);
			}
			sa[i]=s2;
		}
		for (int i = 0; i < sa.length; i++) {
			System.out.print(sa[i]+" ");
		}

	}

}
