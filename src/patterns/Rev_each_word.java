package patterns;

public class Rev_each_word {

	public static void main(String[] args) {
      String a="is this moon lovely";
      String arr[]=a.split(" ");
      for(int i=0;i<arr.length;i++) {
    	  String s= arr[i];
    	  String al="";
    	  for(int j=s.length()-1;j>=0;j--) {
    		  char ch=s.charAt(j);
    		  al=al+ch;
    	  }
    	  System.out.println(al);
      }
	}

}
