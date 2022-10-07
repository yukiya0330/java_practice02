package java_practise02;

import java.util.Scanner;

public class P_4_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numbers = {3, 4, 9};

		System.out.println("1桁の数字を入力してください。");

		int input = sc.nextInt();

		for(int value : numbers) {
			if(value == input) {
				System.out.println("アタリ！");
				break;
			}else {
				System.out.println("ハズレ");
				break;
			}
		}
	}

}
