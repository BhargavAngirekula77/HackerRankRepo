package abstraction;

import java.util.ArrayList;

public class Gobal_object {
	static Gobal_object obj= new Gobal_object();
	static ArrayList aro= new ArrayList();
	
	
	
	
	public  void m1() {
		aro.add(46466);
	}
	
	
	
	public  void m2() {
		aro.add("bdcbb");
	}
	
	
	
	
	public static void main(String[] args) {
		obj.m1();
		obj.m2();
		aro.add(true);
		
		System.out.println(aro);
	

	}

}
