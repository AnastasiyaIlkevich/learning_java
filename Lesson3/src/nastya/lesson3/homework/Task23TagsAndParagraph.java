package nastya.lesson3.homework;

public class Task23TagsAndParagraph {

    //Задание 23
    //Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
    //которых есть параметры, например <p id=”p1”>, и замену их на простые теги
    //абзацев <p>.

    public static void main(String[] args) {

        String str = "<p id=”p1”> В старинны годы люди были </p>\n" +
                "</p id=”p22”> Совсем не то, что в наши дни; </p>\n" +
                "</p id=”qwerty”> Коль в мире есть любовь любили </p>\n" +
                "</p> Чистосердечнее они. </p>\n" +
                "<div> Автор: М. Ю. Лермонтов <div>";

        System.out.println(str.replaceAll("</?p( id=”p[1-9]+”)?>|</?div>|</?p( id=”[a-z]+”)?>", "<p>"));
    }
}
