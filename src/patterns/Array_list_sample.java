package patterns;

import java.util.ArrayList;

public class Array_list_sample {

	public static void main(String[] args) {
    ArrayList ar= new ArrayList();
    ar.add('j');
    ar.add(5566);
    ar.add('f');
    ar.add('o');
    ar.add('h');
    ar.add(' ');
    ar.add(6646);
    ar.add("dnkck");
    ar.add("salvjkbbksj");
    ar.add("salt");
    ar.add("sekfnnk");
    int count=0;
    int countif=0;
    
    	
    for (int i = 0; i < ar.size(); i++) {
    	Object obb=ar.get(i);
    	if(obb instanceof Character && !obb.equals(' ')) {
    	countif++;
    	System.out.println(obb);
    	}
		
	}
    
    System.out.println(countif+" :is the count of the character in the collection");
    
    for (Object obj : ar) {
    	if(obj instanceof Character && !obj.equals(' ')) {
		System.out.println(obj);
		count++;
	}
    }
    System.out.println("no of chacter present oin the list: "+count);
    
    for (Object bix : ar) {
    	
    	if(bix instanceof String && ((String) bix).charAt(0)=='s' ) {
    		System.out.println(bix);
    		char c=((String)bix).charAt(0);
    		System.out.println(c);
    		
    	}
		
	}
    

	}

}
