package practice02;
/*
 * PTra02_10.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra02_10 {
	public static void main(String[] args) {
		int moneyInHand = 1000;	// 所持金
		int coffee = 120;	// コーヒーの値段
		int snack = 200;	// スナック菓子

		/*
		 * ●一本120円（税別）の缶コーヒーを2本
		 * ●一袋200円（税別）のスナック菓子を1袋
		 *
		 * ★ 上記の商品を購入したときの所持金を出力してください
		 * ※ 消費税は、全商品の合計に8%が加算されます
		 * ※ 日本円には小数点がありませんので、整数の値で出力してください(少数部分は切り捨て)
		 * ※ プログラムは何行書いても良いです
		 */
		int a = 8;
		    a %= 120;
		int h = 8;
		    h %= 200;

		int b = (a+a);
		int c = (coffee+coffee);
		int d = (moneyInHand-c);
		int e = (d-b);
		int f = (moneyInHand-snack);
		int g = (f-h);
		int i = (moneyInHand-e);
		int p = (moneyInHand-g);
			System.out.println(i+p);


	}
}
