package nastya.lesson3.homework;

import java.util.Scanner;

public class Task18PunctuationMarks {

    //Задание 18
    //Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
    //общее их количество.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любой текст для дальнейшего подсчета всех знаков препинания: ");
        // Проверочная строка  Один. Два, три ? четыре ! пять “ шесть ‘ (семь и восемь)девять : десять ; один-ть
        String verificationString = scanner.nextLine();
        char[] arrayString = verificationString.toCharArray();

        countingCharacters(arrayString);

    }

    private static void countingCharacters(char[] arrayString) {
        char[] symbol = {'.', ',', '?', '!', '\"', '\'', '(', ')', ':', ';', '-'};// почему-то не видит ковычки((((((
        int count = 0;
        for (char c : arrayString) {
            for (char value : symbol) {
                if (c == value) { //перебираю совпадения и заношу в счетчик
                    count++;
                }
            }
        }
        System.out.printf("Проверяеммый текст содержит %d знаков препинания",count );
    }
}





