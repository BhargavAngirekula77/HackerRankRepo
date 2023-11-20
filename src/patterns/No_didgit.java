package patterns;

public class No_didgit {

	public static void main(String[] args) {
      String c="rx100";
      int count=0;
      
      
      for(int i=0;i<c.length();i++) {
    	  char ch=c.charAt(i);
    	  if(ch>='0'&&ch<='9') {
    		  count++;
    	  }
      }
	  System.out.println(count);

	}

}
