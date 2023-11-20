package patterns;

import java.util.ArrayList;

public class String_palindrom {

	public static void main(String[] args) {
    ArrayList<String> a=new ArrayList<String>();
    a.add("samas");
    a.add("rgglgfdknlfdg");
    a.add("madam");
    int u=0;
    for (String obj : a) {
    	
    	String rox="";
    	String b=a.get(u);
    	u++;
    	for(int i=b.length()-1;i>=0;i--) {
    		char c=b.charAt(i);
    		rox=rox+c;
    		
    	}
    	if(b.equals(rox)) {
    		System.out.println(b+": is the palindrom");
    	}
    	else {
    		System.out.println(b+": is not a palindrom");
    	}
    	
		
	}
    

	}

}
