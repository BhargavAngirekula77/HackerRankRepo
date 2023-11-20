package patterns;

public class Rough2 {

	public static void main(String[] args) {
		
			int size=5;
	      int arr[]= {1,2,3,4,5};
	      int a=arr[0];
	      arr[0]=arr[4];
	      arr[4]=a;
	      for(int i=1;i<=5;i++)
	      {if(i==5)
	      {
	    	  i=0;
	    	  System.out.println(arr[i]);
	    	  break;
	      }
	      else
	    	  System.out.println(arr[i]);
	      }

	}

}
