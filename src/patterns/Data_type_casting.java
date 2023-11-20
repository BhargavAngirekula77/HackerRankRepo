package patterns;

public class Data_type_casting {
	public void m1() {
		System.out.println("this is overriden method @ parent");
	}
	int a=56;
    long b=a;
    long d=(long)a;
	public static void main(String[] args) {
		Data_type_casting obj= new Data_type_casting();
		String no="8008432202";
		Integer  nox=obj.a;
		System.out.println(nox);
		int cox=  nox.intValue();
		System.out.println(cox);
		long vox= nox.longValue();
		System.out.println(vox);
		double mox=nox.doubleValue();
		System.out.println(mox);
		Boolean lo=true;
		System.out.println(lo);
		boolean box=lo.booleanValue();
		System.out.println(box);
		double v=126251.266261;
		int boi=(int)v;
		System.out.println(v);
		System.out.println(boi);
		
    
    

	}

}
