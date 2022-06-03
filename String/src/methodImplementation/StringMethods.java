package methodImplementation;

public class StringMethods {

	public static void main(String[] args) {
		String s="I am     fine";
		String[]sa=mysplit(s,' ');
		for (int i = 0; i < sa.length; i++) {
			System.out.print(sa[i]+", ");
		}
		System.out.println(myCompareTo(s, "I am     fine"));

	}

	private static boolean myIsBlank(String s) {
		if (s.length() == 0)
			return true;
		else {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) != ' ') {
					return false;
				}
			}
			return true;
		}
	}
	
	public static boolean myIsEmpty(String s) {
		if (s.length() == 0)
			return true;
		else
			return false;
	}

	public static char[] mytoCharArray(String s) {
		char[] ca = new char[s.length()];
		for (int i = 0; i < ca.length; i++) {
			ca[i] = s.charAt(i);
		}
		return ca;
	}

	public static int myCompareTo(String s1, String s2) {
		for (int i = 0; i < s1.length() && i < s2.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				int diff = s1.charAt(i) - s2.charAt(i);
				return diff;
			}
		}
		int lenDiff = s1.length() - s2.length();
		return lenDiff;
		
	}

	public static int myCompareToIgnoreCase(String s1, String s2) {
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		for (int i = 0; i < s1.length() && i < s2.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) 
				return s1.charAt(i) - s2.charAt(i);
		}
		return s1.length() - s2.length();
		
	}

	public static boolean mycontains(String s1, String s2) {
		// char sequence compare
		if (s2.length() == 0)
			return true;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(0)) {
				int j = i;
				int k = 0; // k always starts from 0 in s2
				int similarcount = 0;

				while (k < s2.length() && j < s1.length()) {
					if (s1.charAt(j) == s2.charAt(k))
						similarcount++;
					else
						break;
					j++;
					k++;
				}
				if (similarcount == s2.length())
					return true;
			}

		}
		return false;
	}

	public static int myindexOf(String s1, String s2) {
		// char sequence
		if (s2.length() == 0)
			return 0;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(0)) {
				int j = i;
				int k = 0;

				int similarcount = 0;
				while (k < s2.length() && j < s1.length()) {
					if (s1.charAt(j) == s2.charAt(k))
						similarcount++;
					else
						break;
					j++;
					k++;
				}
				if (similarcount == s2.length())
					return i;
			}
		}
		return -1;
	}

	public static int mylastIndexOf(String s1, String s2) {

		if (s2.length() == 0)
			return s1.length();
		for (int i = s1.length() - 1; i >= 0; i--) {
			if (s1.charAt(i) == s2.charAt(0)) {
				int j = i;
				int k = 0;

				int similarcount = 0;
				while (k < s2.length() && j < s1.length()) {
					if (s1.charAt(j) == s2.charAt(k))
						similarcount++;
					else
						break;
					j++;
					k++;
				}
				if (similarcount == s2.length())
					return i;
			}

		}
		return -1;

	}

	public static String myreplace(String s, char oldch, char newch) {
		char[] ca = s.toCharArray();
		for (int i = 0; i < ca.length; i++) {
			if (ca[i] == oldch)
				ca[i] = newch;
		}
		String s1 = new String(ca);
		return s1;
	}

	public static String[] mysplit(String s, char ch) {
		// count spaces
		int spacecount = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch)
				spacecount++;
		}
		// create array of length pieces=spaces+1
		String[] sa = new String[spacecount + 1];

		int saindex = 0;
		String x = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) { // put String in array if space found & empty it again
				sa[saindex++] = x;
				x = "";
			}
			else { // creation of string
				x = x + s.charAt(i);
				if (i == s.length() - 1)
					sa[saindex] = x;
			}
		}
		return sa; // array
	}
	
	
	public static boolean myStartsWith(String s1, String s2) {
		if(s2.length()>s1.length())
			return false;
		for (int i = 0; i < s2.length(); i++) {
			if(s1.charAt(i)!=s2.charAt(i))
				return false;
		}
		return true;
	}
	
	public static boolean myEndsWith(String s1, String s2) {
		if(s2.length()>s1.length())
			return false;
		int j=s1.length()-1;
		for (int i = s2.length()-1; i >=0; i--) {
			if(s1.charAt(j)!=s2.charAt(i))
				return false;
			j--;
		}
		return true;

	}

	
	public static String mysubstring(String s1, int start, int end) {
		String s="";
		for (int i = start; i < end; i++) {
			s=s+s1.charAt(i);
		}
		return s;
	}
	

	public static String mysubstring(String s1, int start) {
		String s="";
		for (int i = start; i < s1.length(); i++) {
			s=s+s1.charAt(i);
			
		}
		return s;
	}
	
	
	public static String mytrim(String s) {
		int i=0;						//leading Spaces
		while(s.charAt(i)==' ') {
			i++;
		}
		
		int j=s.length()-1;				//trailing Spaces
		while(s.charAt(j)==' ') {
			j--;
		}
		
		String s1="";					//printing
		for (int k = i; k <=j; k++) {
			s1=s1+s.charAt(k);
		}
		return s1;
	}
	
	
	public static String myUppercase(String s) {
		char[]ca=s.toCharArray();
		for (int i = 0; i < ca.length; i++) {
			if(ca[i]>'a' && ca[i]<'z') {
				int num=ca[i];
				int num2=num-32;
				char ch=(char)num2;
				ca[i]=ch;
			}
		}
		String s1=new String(ca);
		return s1;
	}

	
	public static String myLowercase(String s) {
		char[]ca=s.toCharArray();
		for (int i = 0; i < ca.length; i++) {
			if(ca[i]>'A' && ca[i]<'Z')
				ca[i]=(char)(ca[i]+32);
			
		}
		return new String(ca);
	}

}
