package basics;

public class RevCharWithoutSplit {

	public static void main(String[] args) {
		String s="you all are very good     ";
		char[]ca=s.toCharArray();
		for (int i = 0; i < ca.length; i++) {
			int si=0;							//create
			int ei=0;
			if(ca[i]!=' ') {
				si=i;
				int j=i+1;
				for (; j < ca.length; j++) {	//placement ei
					if(ca[j]==' ') {
						ei=j-1;
						break;
					}
					else if(j==ca.length-1) {		//for last index
						ei=j;
						break;
					}
				}
				while(ei>si) {		//swap
					char ch=ca[si];
					ca[si]=ca[ei];
					ca[ei]=ch;
					ei--; si++;
				}
				i=j;	//to find next spaces than previous starts from end index
			}
		}
		String s1=new String(ca);
		System.out.println(s1);

	}

}
