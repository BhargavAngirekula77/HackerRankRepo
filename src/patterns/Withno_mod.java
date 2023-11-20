package patterns;

public class Withno_mod {

	public static void main(String[] args) {
		int num=145,dum=num,rem,res=1,total=0;
		while(dum>=0)
		{
			rem=dum%10;
			dum=dum/10;
			for(int lox=rem;lox>=0;lox--)
			{
				res=res*lox;
			}
		}
			total=total+res;
			if(num==total)
			{
				System.out.println(num+":is the special number");
			}
			else
			{
				System.out.println("this is not spec number");
			}
			
			
		}
		

	}


