package basics;

public class SamllestLargestWord {

	public static void main(String[] args) {
		
		String s="Have nice day";
		String []sa=s.split(" ");
		for (int i = 0; i < sa.length; i++) {
			for (int j = i+1; j < sa.length; j++) {
				if(sa[i].length()>sa[j].length()) {
					String t=sa[i];
					sa[i]=sa[j];
					sa[j]=t;
				}
			}
		}
		System.out.println("Smallest "+sa[0]);
		System.out.println("largest "+sa[sa.length-1]);

	}

}
