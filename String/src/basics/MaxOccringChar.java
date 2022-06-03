package basics;

public class MaxOccringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcababcdeddddd";
		int maxfrq=0;
		int index=0;
		for (int i = 0; i < s.length(); i++) {
			int c=0;
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j))
					c++;
			}
			System.out.println(s.charAt(i)+" "+c);
//			if(maxfrq<c) {
//				maxfrq=c;
//				index=i;
//			}
		}
		

	}

}
