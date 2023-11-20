package patterns;
import java.util.Scanner;
class Prime_array
{
    public static void main(String args[])
    {
        int star=1,g=1,space=6;
        {
            for(int i=1;i<=13;i++)
            {
                char $='A';
                for(int j=1;j<=space;j++)
                {
                System.out.print(" ");
                }
                for(int a=1;a<=star;a++)
                {
                    System.out.print(g+" ");
                    if(g<=7)
                    {
                    	g--;
                    }
                    else
                    {
                    	g++;
                    }
                    }
                
                System.out.println();
                
            
            if(i<=6)
                {
                star+=2;
                space-=1;
                }
                else
                {
                    star-=2;
                    space+=1;
                }
            }
        }
    }
}