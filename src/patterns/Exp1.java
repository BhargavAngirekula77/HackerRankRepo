package patterns;

public class Exp1 {

	public static void main(String[] args) {
		int arr[]= {10,265,2645,3584665,557426854,124796532,7894136};
		int a=10,b=0;
		String ab="bhargav angirekula",rox=null;
		/**try {
			System.out.println(ab.charAt(566));
		}
		catch(StringIndexOutOfBoundsException obj2) {
			System.out.println(obj2.getMessage());
		}**/
		//try {
			System.out.println(rox.charAt(5));
		/**}
		catch(Exception ob3) {
			System.out.println(ob3.getMessage());
		}**/
		
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException obj) {
			System.out.println(obj.getMessage());
			
		}
			try {
			System.out.println(arr[56]);
			}
			catch(ArrayIndexOutOfBoundsException obj1) {
				System.out.println(obj1.getMessage());
			}
		
		
		
		finally {
			System.out.println("this is the eng of this code ");
		}

	}

}
