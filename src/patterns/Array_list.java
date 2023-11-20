package patterns;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list {

	public static void main(String[] args) {
      ArrayList rov=new ArrayList();
      rov.add(5644);
      rov.add(2335655);
      rov.add("xxhgdgjdjh");
      rov.add(true);
      rov.add(null);
    System.out.println(rov);
    Iterator itr=rov.iterator();
    while(itr.hasNext()){
    	System.out.println(itr.next());
    }
    System.out.println();
    rov.remove(true);

   // int arr[]=rov.toArray();
    System.out.println("for each operation");
    for (Object obj : rov) {
    	if(obj instanceof Integer) {
    		System.out.println(obj);
    	}
    	
	}
    rov.removeAll(rov);
    System.out.println();
    System.out.println("taditional for loop");
    for(int i=0;i<rov.size();i++) {
    	System.out.println(rov.get(i));
    }
	}

}
