package java_practise02;

import java.util.Random;
import java.util.Scanner;

public class P_2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("ようこそ占いの館へ");

		System.out.println("あなたの名前を入力してください");
		String name = sc.nextLine();

		System.out.println("あなたの年齢を入力してください");
		String ageString = sc.nextLine();
		int age = Integer.parseInt(ageString);

		int fortune = rand.nextInt(4);
		fortune++;

		System.out.println("占いの結果が出ました！");

		System.out.println(age + "歳の" + name + "さん、あなたの運気番号は、" + fortune + "です。");
		System.out.println("1:大吉 2:中吉 3:吉 4:凶");
	}

}
