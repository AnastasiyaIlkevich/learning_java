package nastya.lesson5.homework.task28;

public class Task28 {

    //Задание 28
    //Написать класс, который умеет хранить в себе массив любых типов данных (int, long
    //etc.). Реализовать метод get(int index), который возвращает любой элемент
    //массива по индексу.

    public static void main(String[] args) {

        Integer[] i = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Long[] l = {10L, 20L, 30L, 40L, 50L, 60L, 70L, 80L, 90L, 100L};
        Double[] d = {1.10, 2.20, 3.30, 4.40, 5.50, 6.60, 7.70, 8.80, 9.90};
        String[] s = {"hello", "my", "array"};

        Numbers<Object> numberInteger = new Numbers<>(i);
        Numbers<Object> numberLong = new Numbers<>(l);
        Numbers<Object> numberDouble = new Numbers<>(d);
        Numbers<Object> strString = new Numbers<>(s);

        System.out.println(numberInteger.getArray(2));
        System.out.println(numberLong.getArray(2));
        System.out.println(numberDouble.getArray(2));
        System.out.println(strString.getArray(2));

    }
}

class Numbers<T> {

    T[] array;

    public Numbers(T[] array) {
        this.array = array;
    }

    public T getArray(int index) {//надеюсь это то что требовалось "Реализовать метод get(int index)"
        return array[index];

    }

}