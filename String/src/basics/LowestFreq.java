package basics;

public class LowestFreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "weLcome";
		int min=Integer.MAX_VALUE;
		char varmin=0;
		for(int i=0;i<s1.length();i++){
			int cnt=0;
			for(int j=0;j<i;j++){
				if(s1.charAt(i)==s1.charAt(j)){
					cnt++;
				}
			}
			if(cnt==0){
				int c=0;
				for(int j=0;j<s1.length();j++){
					if(s1.charAt(i)==s1.charAt(j)){
						c++;
					}
				}
				
				if(min>c){
					min=c;
					varmin=s1.charAt(i);
				}
			}
		} 
		System.out.println(min);
		System.out.println(varmin);	

	}

}
