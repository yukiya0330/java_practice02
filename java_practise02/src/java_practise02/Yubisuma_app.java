package java_practise02;

import java.util.Random;
import java.util.Scanner;

public class Yubisuma_app {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		System.out.println("これから指スマを開始します あなたが先行です");
//		自分の指数
		int myFinger = 2;
//		相手の指数
		int botFinger = 2;

		for(;;) {

//			2:2の場合
			if(myFinger == 2 && botFinger == 2) {
				System.out.println("-----------------------------------");
				System.out.println("自分：2　相手：2");
				System.out.println("!!!あなたの番です!!!");
				System.out.println(" 0~4 で宣言してください");
				int anser = sc.nextInt();
				System.out.println(" 0~2 で自分があげる指の数を選んでください");
				int finger = sc.nextInt();
				int bot = rnd.nextInt(botFinger + 1);
//				myFinger減算
				if(finger + bot == anser) {
					System.out.println("的中!!");
					myFinger--;
					System.out.println("-----------------------------------");
					System.out.println("自分：1　相手：２");
					System.out.println("!!!相手の番です!!!");
					System.out.println(" 0~1 で自分があげる指の数を選んでください");
					int botTurnMyFinger = sc.nextInt();
//					Botのターン(Botの宣言・Botのあげる指選定)
					int botAnser = rnd.nextInt(botFinger + myFinger + 1);
					int botTurnFinger = rnd.nextInt(botFinger + 1);
					if(botTurnMyFinger + botTurnFinger == botAnser) {
						System.out.println("やられた!!");
						botFinger--;
					}else {
						System.out.println("セーフ!!");
					}
				}else {
					System.out.println("残念!!");
					System.out.println("-----------------------------------");
					System.out.println("自分：２　相手：２");
					System.out.println("!!!相手の番です!!!");
					System.out.println(" 0~2 で自分があげる指の数を選んでください");
					int botTurnMyFinger = sc.nextInt();
					int botAnser = rnd.nextInt(botFinger + myFinger + 1);
					int botTurnFinger = rnd.nextInt(botFinger + 1);
					if(botTurnMyFinger + botTurnFinger == botAnser) {
						System.out.println("やられた!!");
						botFinger--;
					}else {
						System.out.println("セーフ!!");
					}
				}

//			1:2の場合
			}else if(myFinger == 1 && botFinger == 2) {
				System.out.println("-----------------------------------");
				System.out.println("自分：1　相手：２");
				System.out.println(" 0~3 までを選んでください");
				int anser = sc.nextInt();
				System.out.println(" 0~1 まで自分があげる指の数を選んでください");
				int finger = sc.nextInt();
				int bot = rnd.nextInt(botFinger + 1);
				if(finger + bot == anser) {
					System.out.println("的中!!");
					myFinger--;
				}else {
					System.out.println("残念!!");
					System.out.println("-----------------------------------");
					System.out.println("自分：1　相手：２");
					System.out.println("!!!相手の番です!!!");
					System.out.println(" 0~1 で自分があげる指の数を選んでください");
					int botTurnMyFinger = sc.nextInt();
					int botAnser = rnd.nextInt(botFinger + myFinger + 1);
					int botTurnFinger = rnd.nextInt(botFinger + 1);
					if(botTurnMyFinger + botTurnFinger == botAnser) {
						System.out.println("やられた!!");
						botFinger--;
					}else {
						System.out.println("セーフ!!");
					}
				}

//			2:1の場合
			}else if(myFinger == 2 && botFinger == 1) {
				System.out.println("-----------------------------------");
				System.out.println("自分：2　相手：1");
				System.out.println(" 0~3 までを選んでください");
				int anser = sc.nextInt();
				System.out.println(" 0~2 まで自分があげる指の数を選んでください");
				int finger = sc.nextInt();
				int bot = rnd.nextInt(botFinger + 1);
				if(finger + bot == anser) {
					System.out.println("的中!!");
					myFinger--;
					System.out.println("-----------------------------------");
					System.out.println("自分：1　相手：1");
					System.out.println("!!!相手の番です!!!");
					System.out.println(" 0~1 で自分があげる指の数を選んでください");
					int botTurnMyFinger = sc.nextInt();
					int botAnser = rnd.nextInt(botFinger + myFinger + 1);
					int botTurnFinger = rnd.nextInt(botFinger + 1);
					if(botTurnMyFinger + botTurnFinger == botAnser) {
						System.out.println("やられた!!");
						botFinger--;
					}else {
						System.out.println("セーフ!!");
					}
				}else {
					System.out.println("残念!!");
					System.out.println("-----------------------------------");
					System.out.println("自分：2　相手：1");
					System.out.println("!!!相手の番です!!!");
					System.out.println(" 0~2 で自分があげる指の数を選んでください");
					int botTurnMyFinger = sc.nextInt();
					int botAnser = rnd.nextInt(botFinger + myFinger + 1);
					int botTurnFinger = rnd.nextInt(botFinger + 1);
					if(botTurnMyFinger + botTurnFinger == botAnser) {
						System.out.println("やられた!!");
						botFinger--;
					}else {
						System.out.println("セーフ!!");
					}
				}
//			1:1の場合
			}else if(myFinger == 1 && botFinger == 1) {
				System.out.println("-----------------------------------");
				System.out.println("自分：1　相手：1");
				System.out.println("!!!あなたの番です!!!");
				System.out.println(" 0~2 で宣言してください");
				int anser = sc.nextInt();
				System.out.println(" 0~1 で自分があげる指の数を選んでください");
				int finger = sc.nextInt();
				int bot = rnd.nextInt(botFinger + 1);
				if(finger + bot == anser) {
					System.out.println("的中!!");
					myFinger--;
				}else {
					System.out.println("残念!!");
					System.out.println("-----------------------------------");
					System.out.println("自分：1　相手：1");
					System.out.println("!!!相手の番です!!!");
					System.out.println(" 0~1 で自分があげる指の数を選んでください");
					int botTurnMyFinger = sc.nextInt();
					int botAnser = rnd.nextInt(botFinger + myFinger + 1);
					int botTurnFinger = rnd.nextInt(botFinger + 1);
					if(botTurnMyFinger + botTurnFinger == botAnser) {
						System.out.println("やられた!!");
						botFinger--;
					}else {
						System.out.println("セーフ!!");
					}
				}
			}
			if(myFinger == 0) {
				System.out.println("勝利!!");
				break;
			}else if(botFinger == 0){
				System.out.println("負けました");
				break;
			}
		}
	}
}
