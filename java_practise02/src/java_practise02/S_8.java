package java_practise02;

public class S_8 {

	public static void main(String[] args) {
		Sample s = new Sample(10);
		System.out.println(modify(s.num));
	}

	private static int modify(int num) {
		return num *= 2;
	}

}
