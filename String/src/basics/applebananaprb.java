package basics;

public class applebananaprb {

	public static void main(String[] args) {
/*apple count>banana count && contains apple & banana only*/
		
		String s="ABAAAAAABBB";		//A=apple; B=Banana
		
		for (int i = 0; i < s.length(); i++) {
			int c=0;
			for (int j = 0; j < s.length(); j++) {
				char ch=s.charAt(j);
				if(ch=='A' || ch=='B')
					c++;
			}
			if(c==s.length()) 
			{
				int a=0,b=0;
				for (int j = 0; j < s.length(); j++) {
					char ch=s.charAt(j);
					if(ch=='A')
						a++;
					if(ch=='B')
						b++;
				}
				if(a>b) {
					System.out.println(s.length());
					break;
				}
				else {
					System.out.println(-1);
					break;
				}
			}
			else {
				System.out.println(-1);
				break;
			}
		}
	}
}
