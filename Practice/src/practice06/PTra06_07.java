package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for(int i = 0; i < 5; i++) {

			for(int x = 0; x < i; x++) {
				System.out.print("■");
			}
			for(int y = 5; y > i; y--) {
				System.out.print("□");
			}

			System.out.println();
		}

		for(int i = 0; i < 5; i++) {

			for(int x = 5; x > i; x--) {
				System.out.print("■");
			}

			for(int y = 0; y < i; y++) {
				System.out.print("□");
			}

			System.out.println();
		}
	}
}
