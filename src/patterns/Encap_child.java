package patterns;

public class Encap_child extends Encap{

	public static void main(String[] args) {
		Encap_child obj=new Encap_child();
		System.out.println(obj.getA());
		System.out.println(obj.getNumber());
		obj.setA("sujatha");
		obj.setNumber(8328074375l);
		System.out.println(obj.getA());
		System.out.println(obj.getNumber());

	}

}
