package basics;

public class MaxFrq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="7iro67rotturw5wtdasdfg";
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
		
		char[] ca=s1.toCharArray();
		int[] ia=new int[s1.length()];
		
		for (int i = 0; i < ca.length; i++) {
			char ch=ca[i];
			int count=0;
			
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j)==ch)
					count++;
			}
			ia[i]=count;
		}
		for (int i = 0; i < ia.length; i++) {
			for (int j = i+1; j < ia.length; j++) {
				if(ia[i]<ia[j])
				{
					//swap ca
					char ch=ca[i];
					ca[i]=ca[j];
					ca[j]=ch;
					//swap ia
					int temp=ia[i];
					ia[i]=ia[j];
					ia[j]=temp;
				}
			}
		}
		System.out.println(ca[0]+" "+ia[0]);

	}
	
/*
	 public static void main(String[] args) {
			String s="abcababcdebbbabcaab";
			int max=0;
			int index=0;
			for (int i = 0; i < s.length(); i++) {
				int c=0;
				for (int j = 0; j < s.length(); j++) {
					if(s.charAt(i)==s.charAt(j))
						c++;
				}
				if(c>max) {
					max=c;
					index=i;
				}
			}
			System.out.println(s.charAt(index)+" "+max);
	
		}
 */

}
