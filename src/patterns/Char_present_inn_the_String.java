package patterns;
import java.util.Scanner;

public class Char_present_inn_the_String {
	public int m1(String s,char c) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			char r=s.charAt(i);
			if(r==c) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the characterh");
		char c=sc.next().charAt(0);
		System.out.println("enter the string value");
		
		sc.nextLine();
		String a=sc.nextLine();
		Char_present_inn_the_String obj=new Char_present_inn_the_String();
		System.out.println(obj.m1(a, c));
      
	}

}
