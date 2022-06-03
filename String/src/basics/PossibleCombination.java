package basics;

public class PossibleCombination {

	public static void main(String[] args) {
		String s="abc";
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				String x="";
				for (int k = i; k <=j; k++) {
					x=x+s.charAt(k);
				}
				System.out.println(x);
			}
		}
		

	}

}
