package patterns;

import java.util.Scanner;

public class Unknown {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0,b=2,c=10;
		int num=1;int vo=0;
		for(int i=1;i<=c;i++) {
		
			vo=vo+(num*b);
			System.out.print(a+vo+" ");
			num=num*2;
				
			
		}
	}

}
