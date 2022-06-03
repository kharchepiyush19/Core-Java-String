package basics;

public class CompareGivenStringToTheSpecifiedChSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcd";
		String s2="bacd";
		char ch1[]=s1.toCharArray();
		char []ch2=s2.toCharArray();
		if(ch1.length==ch2.length)
		{
			int cnt=0;
			for(int i=0; i<ch1.length; i++)
			{
				int num1=ch1[i];
				int num2=ch2[i];
				if(num1!=num2)
				{
					cnt++;
					System.out.println(false);
					break;
				}
			}
			if(cnt==0)
			System.out.println(true);
		}
		else
		System.out.println(false);

	}

}
