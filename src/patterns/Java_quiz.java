package patterns;

class Java_quiz {
	Java_quiz(){
		this(20);
		System.out.println(0);
	}
	Java_quiz(int a){
		this(90.90f);
		System.out.println(6);
	}
	Java_quiz(float a){
		this(90.09);
		System.out.println(12);
	}
	Java_quiz(double a){
		System.out.println(17);
	}

	public static void main(String[] args) {
		new Java_quiz();

	}

}
