package basics;

public class PrintChTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcd";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			
			s1=s1+s.charAt(i)+s.charAt(i);
			
		}
	System.out.println(s1);

	}

}
