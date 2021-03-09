package by.nastya.lesson2;

import java.util.Random;

public class Task8RightEndOfCase {
    static Random random = new Random();

    public static void main(String[] args) {
        //8
        //Имеется целове число (задать с помощью Random rand = new Random(); int x =
        //rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
        //нему слово «рублей» в правильном падеже.

        int randomMoney = random.nextInt(1000)+1;//(1000-1)+1 (max-min)+min

        endMoney(randomMoney);
    }

    public static void endMoney(int randomMoney) {

        int endRandomMoney = randomMoney % 10;
        if (randomMoney >= 11 && randomMoney <= 19) {
            System.out.printf("%d рублей", randomMoney);
        } else {
            switch (endRandomMoney) {//понравилась такая запись))))

                case 0, 5, 6, 7, 8, 9 -> System.out.printf("%d рублей", randomMoney);

                case 1 -> System.out.printf("%d рубль", randomMoney);

                case 2, 3, 4 -> System.out.printf("%d рубля", randomMoney);
            }
        }
    }
}
