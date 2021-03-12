package nastya.lesson3.homework;

public class Task21StringBuilder {

    //Задание 21
    //Напишите три цикла выполняющих многократное сложение строк, один с
    //помощью оператора сложения и String, другой с помощью StringBuilder и метода
    //append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
    public static final String purple = "\u001B[35m";

    public static void main(String[] args) {

        String str1 = "Карл у ";
        String str2 = "Клары украл кораллы,";
        String str3 = "а Клара у ";
        String str4 = "Карла украла кларнет. ";
        String str5 = "Если бы ";
        String str6 = "Карл у Клары ";
        String str7 = "не крал кораллы, ";
        String str8 = "то Клара у Карла ";
        String str9 = "не ";
        String str10 = "крала б кларнет.";

        long start = System.nanoTime();
        System.out.println(cycleString(str1, str2, str3, str4, str5, str6, str7, str8, str9, str10));
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.printf("Скорость выполнения программы сложения String %d нс.", elapsed);
        System.out.println();

        long start1 = System.nanoTime();
        System.out.println(cycleStringBuilder(str1, str2, str3, str4, str5, str6, str7, str8, str9, str10));
        long finish1 = System.nanoTime();
        long elapsed1 = finish1 - start1;
        System.out.printf("Скорость выполнения программы сложения StringBuilder %d нс.", elapsed1);
        System.out.println();

        long start2 = System.nanoTime();
        System.out.println(cycleStringBuffer(str1, str2, str3, str4, str5, str6, str7, str8, str9, str10));
        long finish2 = System.nanoTime();
        long elapsed2 = finish2 - start2;
        System.out.printf("Скорость выполнения программы сложения StringBuffer %d нс.", elapsed2);
        System.out.println();

        comparingCycle(elapsed, elapsed1, elapsed2);

    }

    private static void comparingCycle(long elapsed, long elapsed1, long elapsed2) {
        if (elapsed < elapsed1 && elapsed < elapsed2) {
            System.out.println(purple + "Быстрее всего было выполнение сложения String.");
        } else if (elapsed1 < elapsed && elapsed1 < elapsed2) {
            System.out.println(purple + "Быстрее всего было выполнение сложения StringBuilder.");
        } else if (elapsed2 < elapsed && elapsed2 < elapsed1) {
            System.out.println(purple + "Быстрее всего было выполнение сложения StringBuffer.");
        }
    }

    private static StringBuffer cycleStringBuffer(String str1, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        StringBuffer buffer = new StringBuffer();
        buffer.append(str1)
                .append(str2)
                .append(str3)
                .append(str4)
                .append(str5)
                .append(str6)
                .append(str7)
                .append(str8)
                .append(str9)
                .append(str10);
        return buffer;
    }

    private static StringBuilder cycleStringBuilder(String str1, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        StringBuilder builder = new StringBuilder();
        builder.append(str1)
                .append(str2)
                .append(str3)
                .append(str4)
                .append(str5)
                .append(str6)
                .append(str7)
                .append(str8)
                .append(str9)
                .append(str10);
        return builder;
    }

    private static String cycleString(String str1, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        return str1 + str2 + str3 + str4 + str5 + str6 + str7 + str8 + str9 + str10;
    }
}