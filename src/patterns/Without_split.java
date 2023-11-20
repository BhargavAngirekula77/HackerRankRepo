package patterns;

public class Without_split {

	public static void main(String[] args) {
		String v="is this moon lovely";
		int count=1,count1=0;
		for(int i=0;i<v.length();i++) {
			char c=v.charAt(i);
			if(c==' ') {
				count++;
			}
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count1++;
			}
		}
		System.out.println(count);
        System.out.println(count1+"no.of owels presennt");
	}

}
