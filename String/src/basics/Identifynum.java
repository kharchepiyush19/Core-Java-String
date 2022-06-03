package basics;

public class Identifynum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="j5661";
		int c=0;
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			if(ch<'0' ||ch>'9')
				c++;
		}
		if(c==0)
			System.out.println("OnlyDigits");
		else
			System.out.println("notOnlyDigits");

	}

}
