package basics;

public class MaxSubString {

	public static void main(String[] args) {
		//		  0123456789
		String s="ababcdeabpqrstuv";
		int maxsublen=0;
		int startindexofsub=0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i+1; j < s.length(); j++) {
				int count=0;
				for (int k = i; k < j; k++) {
					if(s.charAt(j)==s.charAt(k)) {
						count++;	//if found duplicate
						break;
					}
				}
				if(count>0 || j==s.length()-1) {
					break;
				}
					int len=j-i;	
					if(maxsublen<len) {
						maxsublen=len;
						startindexofsub=i;
					}

			}
		}
		System.out.println(maxsublen);
		for (int z = startindexofsub; z < startindexofsub+maxsublen; z++) {
			System.out.print(s.charAt(z));
		}

	}

}
