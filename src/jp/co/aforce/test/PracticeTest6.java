package jp.co.aforce.test;

public class PracticeTest6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		MinMax minMax = new MinMax();
        int a = 4, b = 2, c = 10;
        System.out.println(a + "と" + b + "と" + c + "のうち、最大のものは" + minMax.getMaxValue(a, b, c));
        System.out.println(a + "と" + b + "と" + c + "のうち、最小のものは" + minMax.getMinValue(a, b, c));
    }

}

//練習問題3
//①クラス
//②インスタンス
//③コンストラクター