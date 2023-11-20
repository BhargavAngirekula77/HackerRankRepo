package patterns;

public class New_mo extends New_overload {
	public void mox() {
		System.out.println("class2 method");
	}
	
	public static void mox(double c,New_mo obj) {
		obj.mox("m");
		System.out.println("this class 2 method 2");
	}

	public static void main(String[] args) {
		New_mo obj=new New_mo();
		obj.mox(5.51515,obj);
      
	}

}
