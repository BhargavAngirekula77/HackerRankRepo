package patterns;

public class New_overload {
	 public static void mox(int a) {
		
  	   System.out.println("this static method");
     }
	 public void mox(String a) {
		 
		 System.out.println("this is non_static");
	 }

	public static void main(String[] args) {
		New_overload name = new New_overload();
		name.mox("m");
		name.exp();
	/**	try {
			name.exp();
		}
		catch(Exception obj) {
		//	System.out.println(obj.getMessage());
			obj.printStackTrace();
		}**/
      
	}
	public void exp() {
		int arr[]= {0,66,46121,6564};
		System.out.println(arr[45]);
	}
	

}
