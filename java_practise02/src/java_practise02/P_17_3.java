package java_practise02;

public class P_17_3 {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("三");
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException例外をcatchしました");
		}
	}

}
