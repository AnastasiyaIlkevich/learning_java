package nastya.lesson3.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Task20LastLetter {

    //Задание 20
//Имеется строка с текстом. Вывести текст, составленный из последних букв
//всех слов.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любой текст и посмотрите что молучится: ");
        // Проверочная  строка  Один. Два, три ? четыре ! пять " шесть   ' (семь и восемь)девять : десять ; один-ть
        String verificationString = scanner.nextLine();
        collectionWords(verificationString);
    }

    private static void collectionWords(String str) {

        StringTokenizer stringTokenizer = new StringTokenizer(str, " ,.?/!;:'-()\"");

        List<String> worldList = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()) {
            worldList.add(stringTokenizer.nextToken());
        }
        lastLetter(worldList);
    }

    private static void lastLetter(List<String> worldList) {

        for (String wL : worldList) {
            char op = wL.toCharArray()[wL.length() - 1];
            System.out.print(op);
        }
    }
}
