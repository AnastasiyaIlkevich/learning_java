package homework.task32;

import java.util.*;

public class Task32 {


    //Задание 32
    //Имеется текст. Следует составить для него частотный словарь.

    public static void main(String[] args) {

        String text = "Мама мама Папа ПаПа дочь";

        String correctedText = text.toLowerCase();

        List<String> str = new ArrayList<>();

        StringTokenizer tokenizer = new StringTokenizer(correctedText, " .,;:!?()-{}\"\n");
        while (tokenizer.hasMoreTokens()) {
            str.add(tokenizer.nextToken());
        }

        Map<String, Integer> words = new HashMap<>();
        for (String po : str) {
            if (!words.containsKey(po)) {
                words.put(po, 1);
            } else {
                int count = words.get(po);
                words.put(po, count + 1);
            }
        }
        System.out.println("Словарь содержит следующие слова ----> " + words);
    }
}




