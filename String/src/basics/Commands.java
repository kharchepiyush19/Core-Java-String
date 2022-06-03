package basics;

public class Commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		  0123
		String s="abcd";
		String z=" ";
		System.out.println(s.length());
		System.out.println(s.charAt(3));		//position
		System.out.println(z.isEmpty());		//considers spaces
		System.out.println(z.isBlank());		//not consider Spaces
		System.out.println(s.codePointAt(0)); 	//asky value
		System.out.println(z.equals(s));		//Compares value from heap
		System.out.println(z==s);
		System.out.println(s.toLowerCase());//Compares Address
		
		String s1="abcdefgh";
		String s2="bbcd";
		int num=s1.compareTo(s2);
		//compares asky value & give difference bet s1-s2
		// if string is same =0
		//if string is same upto some length it states diff bet length s1-s2
		int num2=s1.compareToIgnoreCase(s2);
		System.out.println(num);
		//ignores case(upper or lower)
		
	
		System.out.println(s1.startsWith(s2));
		System.out.println(s1.endsWith(s2));
		System.out.println(s1.contains(s2));
		System.out.println(s1.indexOf('c'));
								//	(inclusive, exclusive)
		System.out.println(s1.substring(2, 5));
		

	}

}
