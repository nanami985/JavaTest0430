package jp.co.aforce.test;

public class Main {

    public static void main(String[] args) {
        PracticeTest8 practice = new PracticeTest8();

        practice.printHello();

        practice.printRandomMassage();

        practice.printMassage("Hello");

        practice.printMassage("Hello", 5);

        practice.printRectangleArea(3, 4);

        String forecast = practice.getWeatherForecast();
        System.out.println(forecast);

        boolean isEven = practice.isEvevNumber(10);
        System.out.println(isEven);

        String message1 = practice.getMessage("太郎", false);
        System.out.println(message1);
        String message2 = practice.getMessage("花子", true);
        System.out.println(message2);

        String[] strings = {"apple", "banana", "orange", "grapefruit"};
        String longestString = practice.getlongestString(strings);
        System.out.println(longestString);

        Person person = new Person("太郎",19);
        boolean isAdult = practice.isAdult(person);
        System.out.println(isAdult);
    }
}




















