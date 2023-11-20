package patterns;

public class Count_int {

	public static void main(String[] args) {
        int a=1613222;
        int count=0;
        int dum=a;
        while(dum>0){
            dum=dum/10;
            count++;
        }
        System.out.println(count);
	}

}
