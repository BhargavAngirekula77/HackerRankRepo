package patterns;

public class Nom {

	public static void main(String[] args) {
		int a = 5;  // binary: 0101
		int b = 3;  // binary: 0011

		 a = a ^ b;  // binary: 0110 (decimal: 6)
		System.out.println(a);
		b=a^b;
		System.out.println(b);
		a = a ^ b;  // binary: 0110 (decimal: 6)
		System.out.println(a);
		

		// TODO Auto-generated method stub

	}

}
