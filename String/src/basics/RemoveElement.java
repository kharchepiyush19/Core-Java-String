package basics;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefg";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch!='e')
				s1=s1+ch;
		}
		s=s1;
		System.out.println(s);

	}

}
