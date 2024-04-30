package jp.co.aforce.test;

public class MinMax {
	
	public int getMaxValue(int a,int b,int c) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}
	
	public int getMinValue(int a, int b,int c) {
		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		return min;
	}

}
