package java_practise02;

public class P_15_1 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 100; i++) {
			sb.append(i + 1).append(",");
		}
		String s = sb.toString();
		String[] a = s.split(",");
		for(int i = 0; i < 100; i++) {
			System.out.print(a[i]);
		}
	}

}
