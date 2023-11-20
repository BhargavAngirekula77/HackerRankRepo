package patterns;

public class Rough1 {

	public static void main(String[] args) {
      int arr[]= {1,2,3,4,5};
      int ay[]= new int[arr.length];
      int r=0;
      for(int i=1;i<=arr.length;i++) {
         	  if(i==arr.length)
    	  {
    		  i=0;
    		  ay[r]=arr[i];
    		  break;
    	  }
    	  else
    	  ay[r]=arr[i];
    	  r++;
      }
      for(int i=0;i<arr.length;i++)
      {
    	  System.out.println(ay[i]);
      }
      
      
	}

}
