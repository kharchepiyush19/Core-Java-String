package basics;
/*
 Given a string S, find the longest palindromic substring in S
i/p :String s="abcdcbd";
o/p :
5
bcdcb
*/
public class PalendromicSubString {

	public static void main(String[] args) {
		String s="abcdcaasdfdsa";
		int maxl=0;
		int sindex=0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				String x="";
				for (int k = i; k <= j; k++) {
					x=x+s.charAt(k);
				}
				//System.out.println(x);
				int q=x.length()-1;
				int sc=0;
				for (int p = 0; p < x.length(); p++) {
					if(x.charAt(p)==x.charAt(q))
						sc++;
					q--;
				}
				if(sc==x.length()) {
					//System.out.println(x);
					if(maxl<x.length()) {
						maxl=x.length();
						sindex=i;
					}
				}
			}
		}
		
		
		System.out.println("length : "+maxl);
		for (int i = sindex; i < sindex+maxl; i++) {
			System.out.print(s.charAt(i));
		}

	}

}
