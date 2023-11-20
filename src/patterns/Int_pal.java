package patterns;

import java.util.ArrayList;

public class Int_pal {

	public static void main(String[] args) {
     ArrayList<Integer> v=new ArrayList();
     v.add(12151);
     v.add(2332);
     v.add(111111);
     v.add(9636656);
     for (Integer num : v) {
    	 int num1=(Integer)num.intValue();
    	 int dum=num1;
    	// System.out.println(num1);
    	 int rem=0,rev=0;
    	 while(dum!=0) {
    		 
    		 rem=dum%10;
    		 dum=dum/10;
    		 rev=(rev*10)+rem;
    	 }
    	 if(num1==rev) {
    		 System.out.println(num+"is a palindrom");
    	 }
		
	}
	}

}
