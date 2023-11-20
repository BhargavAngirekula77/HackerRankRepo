package patterns;

public class Rev_string {

	public static void main(String[] args) {
		String b="this is too lovely";
		String n="";
		for(int i=b.length()-1;i>=0;i--) {
			char c=b.charAt(i);
			n=n+c;
		}
		System.out.println(n);
	}

}
