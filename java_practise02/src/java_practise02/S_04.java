package java_practise02;

public class S_04 {

	public static void main(String[] args) {

		int a = 1;
		for(int b = 2, total = 0; b <= 5; b++) {
			total = a * b;
			System.out.println(total);
		}

		int total = 0;
		for(int b = 0; b <= 5; b ++) {
			total = a * b;
		}
		System.out.println(total);

	}

}
