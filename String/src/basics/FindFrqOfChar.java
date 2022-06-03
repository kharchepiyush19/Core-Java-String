package basics;

public class FindFrqOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdabcaba";
		String s1="";
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			int rightCount=0;
			for (int j = i+1; j < s.length(); j++) {
				if(s.charAt(j)==ch)
					rightCount++;
			}
			if(rightCount==0)
				s1=s1+ch;
		}
		for (int i = 0; i < s1.length(); i++) {
			char ch=s1.charAt(i);
			int count=0;
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j)==ch)
					count++;
			}
			System.out.println(ch+" "+count);
		}

	}

}
