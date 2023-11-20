package patterns;

public class Remove_dup {
	public static void m1(String g) {
		String b= new String("");
		char ch[]=g.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					ch[j]=' ';
				}
				if(ch[i]!=' ') {
					b=b+ch[i];
				}
			}
		}
		for (char c : ch) {
			if(c!=' ') {
		System.out.print(c);	
		b=b+c;
			}
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
        String a="good";
        String b="";
       m1(a);
      //  System.out.println( m1(a));
       
        
	}

}
