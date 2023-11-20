package abstraction;
import java.util.ArrayList;
import java.util.Scanner;

public class Working_class extends Fornt {
	Scanner sc= new  Scanner(System.in);
	
	public void start(Working_class obj) {
		
		System.out.println("hi! welcome to be one of us");
		System.out.println("if you want ot login enter: 1");
		System.out.println("if you want to join as one of us  enter: 2");
		System.out.println("if you enter other than this numbers it will be invalid choice");
		int num=sc.nextInt();
		if(num==1) {
			obj.login(obj);
		}
		else if(num==2) {
			obj.signin(obj);
			
		}
		else {
			System.out.println("invalid data entery");
		}
		
		
				
		
		
	}
	public void signin(Working_class obj) {
		
		System.out.println("enter the phone number");
		long num=sc.nextLong();
		
		
		System.out.println("enter the name of the user");
		sc.nextLine();
		String nam=sc.nextLine();
		
		
		System.out.println("enter the password");
		String pass=sc.nextLine();
		
		System.out.println("enter the user_name");
		String user=sc.nextLine();
		
		
		
		
		
		obj.setPhone(num);
		System.out.println(obj.getPhone());
		
		obj.setName(nam);
		System.out.println(obj.getName());
		
		obj.setPassword(pass);
		System.out.println(obj.getPassword());
		
		obj.setUser_name(user);
		System.out.println(obj.getUser_name());

		System.out.println("now login procedure is start");
		System.out.println("enter the input value \n if you want to login enter: 1");
		
		int num1=sc.nextInt();
		if(num1==1) {
			obj.login(obj);
		}
		else {
			System.out.println("invalid data");
		}
		
	}
	
	
	public void login(Working_class obj) {
		System.out.println("enter the user name");
		
		sc.nextLine();
		String username=sc.nextLine();
		
		System.out.println("enter the password");
		String passwoed=sc.nextLine();
		
		String mainpass=obj.getPassword();
		String mainuse=obj.getUser_name();
		
		
		if(mainuse.equals(username)) {
			if(mainpass.endsWith(passwoed)) {
				System.out.println("your login is sucesssseful");
				System.out.println("exprence our service");
			}
			
		}
		
		
	}
	

	public static void main(String[] args) {
		Working_class obj= new Working_class();
		obj.start(obj);
		//obj.signin(obj);
		
		
		
	}

}
