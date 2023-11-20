package patterns;

public class Exper_child implements MyInterface{
	public static void main(String[] args) {
		String num="8328074375";
		long sum=0l;
		for(int i=0;i<num.length();i++) {
			char ch= num.charAt(i);
			sum=(sum*10)+(ch-48);
		}
		System.out.println(sum);
		char mch='9';
		int a=mch-48;
		System.out.println(a);
		System.out.println(myVariable);
	}
}
	
  
  