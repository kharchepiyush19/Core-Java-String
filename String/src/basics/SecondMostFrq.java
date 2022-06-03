package basics;

public class SecondMostFrq {

	public static void main(String[] args) {
		
		String s1 = "abcd";
		int max=0;
		int smax=-1;
		char ch=' ';
		char ch2=' ';
		for(int i=0;i<s1.length();i++){
			int cnt=0;
			for(int j=0;j<i;j++){
				if(s1.charAt(i)==s1.charAt(j)){
					cnt++;
				}
			}
			if(cnt==0){
				int count=0;
				for(int j=0;j<s1.length();j++){
					if(s1.charAt(i)==s1.charAt(j))
						count++;
				}
				if(count>max){
					max=count;
					ch=s1.charAt(i);		//index for max
				}
				if(count>smax && count!=max){
					smax=count;
					ch2=s1.charAt(i);			//index for smax
				}
			}
		}
		
		System.out.println(ch2+" "+smax);
		
	

	}

}
