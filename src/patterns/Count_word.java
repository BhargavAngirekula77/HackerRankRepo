package patterns;

public class Count_word {
	public int words(String v) {
		int count=0;
		
		String arr[]=v.split(" ");
		for (String obj : arr) {
			System.out.println(obj);
			count++;
			
		}
		System.out.println((count==arr.length)); 
		//System.out.println();
		return count;
	}

	public static void main(String[] args) {
		Count_word obj2= new Count_word();
       String a="is this moon lovely";
      
       int count=0;
       for(int i=0;i<a.length();i++) {
    	   char c=a.charAt(i);
    	   if(c!=' ') {
    		   count++;
    	   }
    	  System.out.println( obj2.words(a));
       }
       System.out.println(count+" :is the no of letter present in string");
	}

}
