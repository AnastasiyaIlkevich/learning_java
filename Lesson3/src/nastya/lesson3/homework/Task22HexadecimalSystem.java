package nastya.lesson3.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22HexadecimalSystem {

    //Задание 22
    //Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
    //записаных по правилам Java, с помощью регулярных выражений и вывести их на
    //страницу.

    //Числа в шестнадцатеричной системе записываются с помощью префиксов 0x и 0X.
    //Допустимые цифры — от 0 до 15, где числа 10-15 обозначаются символами A-F
    //соответственно.

    public static void main(String[] args) {
        String str = "Проверочные числа в шестнадцатеричной системе 0x227B1DA8, 0X7C7, 0x2E5EA658F2,0x312D";
        Pattern hexSystem = Pattern.compile("0x[A-Fa-f0-9]{1,100}|0X[A-Fa-f0-9]{1,100}");//"0x\\p{XDigit}+"
        Matcher hexMatcher = hexSystem.matcher(str);
        System.out.println(str);
        while (hexMatcher.find()) {
            System.out.println(hexMatcher.group());
        }
    }
}
