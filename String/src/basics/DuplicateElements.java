package basics;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcabcaba";
	
		for (int i = 0; i < s.length(); i++) {
			int c=0;
			for (int j = i-1; j >=0; j--) {
				if(s.charAt(i)==s.charAt(j)) {
					c++;
					break;
				}
			}
			if(c>0) {
				
				System.out.println(s.charAt(i)+" ");
			}
		}

	}
}
