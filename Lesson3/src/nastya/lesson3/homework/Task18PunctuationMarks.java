package nastya.lesson3.homework;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18PunctuationMarks {

    //Задание 18
    //Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
    //общее их количество.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любой текст для дальнейшего подсчета всех знаков препинания: ");
        // Проверочная строка  Один. Два, три ? четыре ! пять " шесть ' (семь и восемь)девять : десять ; один-ть
        String verificationString = scanner.nextLine();

        countingCharacters(verificationString);

    }

    // Исправила. Сделала через классы Pattern и Matcher
    private static void countingCharacters(String verificationString) {

        int count = 0;
        Pattern pattern = Pattern.compile("[,.?/!;:'\\-()\"]");
        Matcher matcher = pattern.matcher(verificationString);
        while (matcher.find()) {
            count++;
            //System.out.println(matcher.group()); //для проверки
        }
        System.out.printf("Проверяеммый текст содержит %d знаков препинания", count);
    }
}



