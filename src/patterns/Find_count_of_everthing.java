package patterns;

public class Find_count_of_everthing {

	public static void main(String[] args) {
     String a="GooDjjjFFFIBLJBJKLBKNLNLKNKL;dfm;mmbl'rmb'm'bm'rmb'lm'mg'lmg'f  ff  f f f f f f ff f  moRNInG To All LovE 3000";
     int cap=0,small=0,num=0,space=0;
     for(int i=0;i<a.length();i++) {
    	 char c=a.charAt(i);
    	 if(c>='0'&&c<='9') {
    		 num++;
    	 }
    	 else if(c>='a'&&c<='z') {
    		 small++;
    	 }
    	 else if(c>='A'&&c<='Z') {
    		 cap++;
    	 }
    	 else if(c==' ') {
    		
			space++;
    	 }
     }
     System.out.println("count of the digits: "+num);
     System.out.println("count of the capital: "+cap);
     System.out.println("count of the lower :"+small);
     System.out.println("count of the spaces present: "+space);

	}

}
