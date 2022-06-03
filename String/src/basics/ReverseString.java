package basics;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i am fine";
		String s1="";
		String[]sa =s.split(" ");
		for (int i = sa.length-1; i >=0; i--) {
			System.out.print(sa[i]+" ");
//			s1=s1+sa[i]+" ";
		}
//		System.out.println(s1);

	}

}
