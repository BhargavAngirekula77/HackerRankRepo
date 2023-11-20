package patterns;

public class Only_upper {

	public static void main(String[] args) {
     String s="HnJKGnguyGKJNkFbjjBJHg";
     int count=0,count1=0;
     for(int i=0;i<s.length();i++) {
    	 char ch= s.charAt(i);
    	 if(ch>='a'&&ch<='z') {
    		 count++;
    		 
    	 }
    	 if(ch>='A'&&ch<='Z') {
    		 count1++;
    		 
    	 }
     }
     System.out.println(count);
     System.out.println(count1);
     System.out.println(s.length());
	}

}
