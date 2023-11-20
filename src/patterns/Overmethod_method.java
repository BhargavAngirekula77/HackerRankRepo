package patterns;

public class Overmethod_method {
	public void mox() {
		System.out.println("m1");
	}
	public void mox(int a) {
		System.out.println("m2");
	}
	public void mox(int a,double d) {
		System.out.println("m3");
	}
	public void mox(double d,int a) {
		System.out.println("m4");
	}
	public Overmethod_method() {
		System.out.println("co1");
	}
	
	public Overmethod_method(int a) {
		System.out.println("co2");
	}
	
	public Overmethod_method(int a,double d) {
		System.out.println("co3");
	}
	public Overmethod_method(double d,int a) {
		System.out.println("co4");
	}
	
	

	public static void main(String[] args) {
		Overmethod_method obj=new Overmethod_method();
		obj.mox();
		obj.mox(56);
		obj.mox(15.1161,56);
		obj.mox(44616,56.16212);
		
		Overmethod_method obj1=new Overmethod_method(10);
		Overmethod_method obj2=new Overmethod_method(10,56.262);
		Overmethod_method obj33=new Overmethod_method(16462.21616,2666);

	}

}
