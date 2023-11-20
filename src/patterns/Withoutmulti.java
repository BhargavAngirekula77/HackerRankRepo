package patterns;

public class Withoutmulti {

	public static void main(String[] args) {
		int b=2,count=0,count1=0;
		for(int a=1;a<=100;a++) {
		for(int i=1;i<a;i++) {
			int c=a-(b*i);
			/**if(c<b &&c>0) {
				System.out.println(i+"  is the qou");
				System.out.println(c+"is reminder");
			}**/
			if(c==1) {
				count1++;
				System.out.println(a+"is odd");
			}
			if(c==0) {
				count++;
				System.out.println(a+"is even num");
			}
		}
		}
		System.out.println(count+"even");
		System.out.println(count1+"odd");
	}

}
