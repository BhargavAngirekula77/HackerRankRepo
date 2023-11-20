package patterns;

import java.util.ArrayList;

public class String_in_3_7 {

	public static void main(String[] args) {
     ArrayList<String> s=new ArrayList<String>();
     s.add("saam");
     s.add("jhvvjjh");
     s.add("g");
     s.add("jjjnjnjnjjnjnjnnjjn");
     s.add("gnknfg");
     for (String roll : s) {
		int siz=roll.length();
    	 if(siz>3&& siz<7) {
    		 System.out.println(roll);
    	 }
	}
    	 
     
	}

}
