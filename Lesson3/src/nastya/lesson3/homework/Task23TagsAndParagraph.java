package nastya.lesson3.homework;

public class Task23TagsAndParagraph {

    //Задание 23
    //Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
    //которых есть параметры, например <p id=”p1”>, и замену их на простые теги
    //абзацев <p>.

    public static void main(String[] args) {

        String str = "<p id='qwe' class='test_class example\" style=\"color:red, border: 1px solid\"> В старинны годы люди были </p>\n" +
                "</p id=”p22”> Совсем не то, что в наши дни; </p>\n" +
                "</p id=”qwerty”> Коль в мире есть любовь любили </p>\n" +
                "</p> Чистосердечнее они. </p>\n" +
                "<div> Автор: М. Ю. Лермонтов <div>";

        //если правильно поняла логику, то нужно заменять все что в <.......>

        System.out.println(str.replaceAll("<.*?>", "<p>"));
        //  System.out.println(str.replaceAll("</?p.*?>|</?div>|", "<p>"));// ну или так...
    }
}
