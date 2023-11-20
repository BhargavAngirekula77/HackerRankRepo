package patterns;

public class Type4_8 {

	public static void main(String[] args) {
		 int star=1,space=8;
	        {
	            for(int i=1;i<=5;i++)
	            {
	                for(int a=1;a<=star;a++)
	                {
	                    
	                    System.out.print("*");
	                }
	                for(int j=1;j<=space;j++)
	                {
	                    System.out.print(" ");
	                }
	                for(int c=1;c<=star;c++)
	                {
	                    System.out.print("*");
	                }
	                System.out.println();

	                star+=1;
	                space-=2;
	                
	                
	                
	            }
	        }
	}

}
