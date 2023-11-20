package patterns;

public class Class23 extends Data_type_casting {
	public void m1() {
		System.out.println("this is over riden @ child class");
	}
int r=4616131;
	public static void main(String[] args) {
       try {
		Class23 obj= new Class23();
       System.out.println(obj.a);
       System.out.println(obj.r);
       Data_type_casting obj1=new Data_type_casting();
       System.out.println(obj1.b);
       Class23 obj2=(Class23)obj1;
       System.out.println(obj2.r);

       }
       catch(Exception obj3) {
    	   System.out.println(obj3.getMessage());
    	  obj3.getStackTrace();
       }
	}

}
