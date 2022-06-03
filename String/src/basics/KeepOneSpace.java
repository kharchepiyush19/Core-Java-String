package basics;
/* Adjust Spaces */
public class KeepOneSpace {

	public static void main(String[] args) {
		String s="we     have a   nice    day   ";
		
		//count words
		int c=0;
		for (int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
				c++;
		}
		if(s.charAt(0)!=' ')
			c++;
		
		String []p=new String[c];
		//put in array
		int u=0;
		for (int i = 0; i < s.length(); i++) {
			int si=0;
			int ei=0;
			if(s.charAt(i)!=' ') {
				si=i;
				int j = i+1;
				for (; j < s.length(); j++) {
					if(s.charAt(j)==' ') {
						ei=j-1;
						break;
					}
					if(j==s.length()-1) {
						ei=j;
						break;
					}
				}
				String x="";
				for (int k = si; k <= ei; k++) {
					x=x+s.charAt(k);
				}
				p[u++]=x;
				i=j;	
			}
		}
		
		for(String i:p)
			System.out.print(i+" ");

	}

}
