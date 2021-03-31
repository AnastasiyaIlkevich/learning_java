package nastya.lesson5.homework.task24;

public class Task24TimeObject {

    //Задание 24
    //Создать класс и объекты описывающие промежуток времени. Сам промежуток
    //в классе должен задаваться тремя свойствами: секундами, минутами, часами.
    //Сделать методы для получения полного количества секунд в объекте, сравнения
    //двух объектов (метод должен работать аналогично compareTo в строках). Создать
    //два конструктора: получающий общее количество секунд, и часы, минуты и секунды
    //по отдельности. Сделать метод для вывода данных.

    public static void main(String[] args) {

        Time timeObject1 = new Time(12, 5, 26);
        Time timeObject2 = new Time(26541);

        print(timeObject1, timeObject2);

        compareTime(timeObject1.timeSeconds() - timeObject2.timeSeconds());

    }

    private static void print(Time t1, Time t2) {
        System.out.println("this.print");
        System.out.println("Первый обект в секундах  --> " + t1.timeSeconds());
        System.out.println("Второй обект в секундах  --> " + t2.timeSeconds());
    }

    public static void compareTime(int result) {
        //сравнение трех обектов
        if (result > 0) {
            System.out.println("Результат сравнения--> 1");
        } else if (result == 0) {
            System.out.println("Результат сравнения--> 0");
        } else if (result < 0) {
            System.out.println("Результат сравнения--> -1");
        }
    }
}
