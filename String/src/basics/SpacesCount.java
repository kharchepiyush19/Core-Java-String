package basics;

public class SpacesCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="    HaveNiceDay      ";
		int leadingspace=0;
		int trailingspace=0;
		int i=0;
		while(s.charAt(i)==' ') {
			leadingspace++;
			i++;
		}
		i=s.length()-1;
		while(s.charAt(i)==' ') {
			trailingspace++;
			i--;
		}
		System.out.println("trailing "+trailingspace);
		System.out.println("leading "+leadingspace);

	}

}
