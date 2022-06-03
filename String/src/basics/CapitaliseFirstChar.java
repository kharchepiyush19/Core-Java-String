package basics;

public class CapitaliseFirstChar {

	public static void main(String[] args) {
	
		String s="piyush chandrakant kharche";
		char ca[]=s.toCharArray();
		
		for (int i = 0; i < ca.length-1; i++) {
			if(i==0 && ca[i]>='a' && ca[i]<='z') {	// first char
				int num=(int)ca[i];
				num=num-32;
				char ch=(char)num;
				ca[i]=ch;
			}
			else if(ca[i]==' ' && ca[i+1]>='a' && ca[i+1]<='z') {
				ca[i+1]=(char)(ca[i+1]-32);		//replacing to original position
			}
		}
		s=new String(ca);		//array to string
		System.out.print(s);
		
	}

}
