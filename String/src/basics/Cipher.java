package basics;

public class Cipher {

	public static void main(String[] args) {
		
		String s="acsgHG";
		String s2="";
		s=s.toUpperCase();
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			int num=ch;
			int num1=155-num;
			char ch1=(char)num1;
			s2=s2+ch1;

		}
		System.out.println(s2);
		

	}

}
