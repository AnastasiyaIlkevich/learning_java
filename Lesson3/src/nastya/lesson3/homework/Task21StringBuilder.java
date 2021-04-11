package nastya.lesson3.homework;

public class Task21StringBuilder {

    //Задание 21
    //Напишите три цикла выполняющих многократное сложение строк, один с
    //помощью оператора сложения и String, другой с помощью StringBuilder и метода
    //append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
    public static final String purple = "\u001B[35m";

    public static void main(String[] args) {

        long start = System.nanoTime();
        cycleString();
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.printf("Скорость выполнения программы сложения String %d нс.", elapsed);
        System.out.println();

        long start1 = System.nanoTime();
        cycleStringBuilder();
        long finish1 = System.nanoTime();
        long elapsed1 = finish1 - start1;
        System.out.printf("Скорость выполнения программы сложения StringBuilder %d нс.", elapsed1);
        System.out.println();

        long start2 = System.nanoTime();
        cycleStringBuffer();
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


    private static boolean cycleStringBuffer() {
        StringBuffer buffer = new StringBuffer();
        int count = 0;
        while (count < 10000) {
            buffer.append("string");
            count++;
        }

        return false;
    }

    private static boolean cycleStringBuilder() {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        while (count < 10000) {
            builder.append("string");
            count++;
        }
        return false;
    }

    private static boolean cycleString() {
        int count = 0;
        while (count < 10000) {
            String str = "string";
            str = str + "string";
            count++;
        }
        return false;
    }
}