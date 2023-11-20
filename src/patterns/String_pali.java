package patterns;

public class String_pali {
	public String pal(String a) {
		String c="";
		for(int i=a.length()-1;i>=0;i--) {
			char ch= a.charAt(i);
			c=c+ch;
		}
		return c;
	}

	public static void main(String[] args) {
		String s="madam";
		String_pali obj= new String_pali();
		String b=obj.pal(s);
		System.out.println(b);
		if(s.equals(b)) {
			System.out.println(s+"is a palindrom");
		}
		else {
			System.out.println(s+"is not a palindrom");
		}
		

	}

}
