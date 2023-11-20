package patterns;
import java.util.Scanner;

public class Child_imp {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter valid input");
	int input= sc.nextInt();
	
	if(input==1) {
		Child_1 obj=new Child_1();
		obj.m1();
	}
	else if(input==2) {
		Clild_2 obj1=new Clild_2();
		obj1.m1();
	}
	else {
		System.out.println("it's invalid");
	}
	}

}
