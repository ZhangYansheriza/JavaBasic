package practice08;
/*
 * PTra08_01.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra08_01 {
	public static void main(String[] args) {

		// ★ 変数receiveを宣言し、メソッドnumberを実行した結果を代入してください
		receive(100);
	}


		// ★ 変数receiveを出力してください
		public static void receive(int number) {
			for (int i =0; i< number;i++) {
				System.out.println("return 100;");
			}
	}

	/*
	 * 以下の仕様でメソッドを作成しました
	 *
	 * 戻り値		：int
	 * メソッド名	：number
	 * 引数			：なし
	 *
	 * 100を返すメソッド
	 */
	public static int number() {
		return 100;
	}
}
