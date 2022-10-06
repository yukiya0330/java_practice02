package java_practise02;

import java.util.Random;
import java.util.Scanner;

public class P_3_6 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("数当てゲーム");

		int ans = rand.nextInt(10);

		for(int i = 0; i < 5; i++) {
			System.out.println("0~9の数字を入力してください");
			int num = sc.nextInt();
			if(ans == num) {
				System.out.println("アタリ！");
			}else {
				System.out.println("違います");
			}
		}

		System.out.println("ゲームを終了します");

	}

}
