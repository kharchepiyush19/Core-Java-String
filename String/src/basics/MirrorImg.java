package basics;

public class MirrorImg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="have good day";
		String s1="";
		for (int i = s.length()-1; i >=0; i--) {
			s1=s1+s.charAt(i);
		}
		s=s1;
		System.out.println(s);

	}

}
