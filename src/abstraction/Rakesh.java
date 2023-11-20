package abstraction;

public class Rakesh {

	public static void main(String[] args) {
		int rr[]={1,2,3,4};
		
		int size=rr.length;
		for(int i=0;i<rr.length/2;i++) {
			int k=(1+i);
			int p1=rr[i],p2=rr[size-k];
			
			rr[i]=p2;
			rr[size-k]=p1;
//			ite++;
		}
		for(int j=0;j<rr.length;j++) {
			System.out.println(rr[j]);
		}
		;

	}

}
