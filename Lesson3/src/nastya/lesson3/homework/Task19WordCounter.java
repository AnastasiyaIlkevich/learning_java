package nastya.lesson3.homework;

import java.util.Scanner;

public class Task19WordCounter {
    //Задание 19
    //Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
    //учесть, что слова могут разделяться несколькими пробелами, в начале и конце
    //текста также могут быть пробелы, но могут и отсутствовать.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любой текст для дальнейшего подсчета колличества слов: ");
        //  Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
        String verificationString = scanner.nextLine();
        wordCounter(verificationString);
    }

    private static void wordCounter(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.printf("Проверяеммый текст состоит из %d слов(а)", count);
    }
}

