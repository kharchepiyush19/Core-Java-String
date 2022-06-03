package basics;

public class SumOfNumbers {

	public static void main(String[] args) {
		String s="45hj785hjghnj2";
		String s1="";
		
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)<'0' || s.charAt(i)>'9')
				s1=s1+" ";
			else
				s1=s1+s.charAt(i);
		}
		System.out.println(s1);
		
		String []a=s1.split(" ");
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			if(!a[i].equals(""))
				sum=sum+Integer.parseInt(a[i]);
		}
		
		System.out.println(sum);

	}
	
	
	
/*	
	public static void main(String[] args) {
		String s = "45ajgjh75j8";

		String[] a = new String[s.length()];
		int index = 0;
		String x = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				x = x + s.charAt(i);
				if (i == s.length() - 1)
					a[index++] = x;
			} 
			else  {
				a[index++] = x;
				x = "";
			}

		}
		for (String i : a)
			System.out.println(i);

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != null && !a[i].equals(""))
				sum = sum + Integer.parseInt(a[i]);
		}
		System.out.println(sum);

	}
*/

}
