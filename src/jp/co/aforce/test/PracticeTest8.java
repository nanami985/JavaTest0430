package jp.co.aforce.test;

import java.util.Random;

public class PracticeTest8 {

	public void printHello() {
		System.out.println("Hello");
	}
	
	public void printRandomMassage() {
		int n = (int)(3*Math.random());
		switch (n) {
		case 0:
			System.out.println("おはよう");
			break;
		case 1:
			System.out.println("こんにちは");
			break;
		case 2:
			System.out.println("こんばんは");
			break;
		}
	}
	
	public void printMassage(String message) {
		System.out.println(message);
	}
	
	public void printMassage(String message,int count) {
		for(int i = 0; i < count; i++) {
		System.out.println(message);
		}
	}
	
	public void printRectangleArea(double height,double width) {
		double area = height * width;
		System.out.println(area);
	}
	
	public String getWeatherForecast() {
		String[] days = {"今日","明日","明後日"};
		String[] weatherCondition = {"晴れ","曇り","雨","雪"};
		Random random = new Random();
		int dayIndex = random.nextInt(days.length);
		int weatherIndex = random.nextInt(weatherCondition.length);
		String forecast = days[dayIndex] + "の天気は" + weatherCondition[weatherIndex] + "でしょう。";
		return forecast;
	}
	
	public boolean isEvevNumber(int value) {
		return value % 2 == 0;
	}
	
	public String getMessage(String name,boolean isKid) {
		if(isKid) {
			return "こんにちは。" + name + "ちゃん。";
		}else{
			return "こんにちは。"  + name + "さん。";
		}
	}
	
	public String getlongestString(String[] array) {
		String longestString = "";
		int maxLength = 0;
		for(int i = array.length - 1;i >= 0;i--) {
			String currentString = array[i];
			int currentLength = currentString.length();
		if(currentLength > maxLength) {
			longestString = currentString;
			maxLength= currentLength;
		}
		}
		return longestString;
	}
	
	public boolean isAdult(Person person) {
		return person.getAge() >= 20;
	}

}





























