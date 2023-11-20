package patterns;
import java.util.Scanner;

public class Samao {

	public static void main(String[] args) {
        Scanner sc= new  Scanner(System.in);
        System.out.println("enter the input");
        int ip= sc.nextInt();
        if(ip==1) {
        	Samro obj1= new Samro();
        	obj1.mox();
        }
        else if(ip==2) {
        	Samroy obj2= new Samroy();
        	obj2.mox();
        }
        else {
        	System.out.println("this is invalid input");
        }
        
	}

}
