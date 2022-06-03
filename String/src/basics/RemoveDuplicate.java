package basics;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String s1 = "abbcfedafbcd";
		for(int i=0; i<s1.length(); i++)
		{
			int c=0;
			for(int j=0; j<i; j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					c++;
					break;
				}
			}
			if(c==0)
			System.out.print(s1.charAt(i)+" ");
		}

	}

}
