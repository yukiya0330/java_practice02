package java_practise02;

public class P_17_1 {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("------ここから-----");
			e.printStackTrace();
			System.out.println("-----ここまで-----");
		}
	}

}
