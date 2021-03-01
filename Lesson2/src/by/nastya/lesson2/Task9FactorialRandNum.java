package by.nastya.lesson2;

public class Task9FactorialRandNum {
    public static void main(String[] args) {

        //Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
        //произведение, т.е. факториал числа.
        //ИЗМЕНИЛА НА РАСЧЕТ СУММЫ ФАКТОРИАЛОВ РАНДОМНЫХ ЧИСЕЛ.

        randFactorialNum();
    }

    private static void randFactorialNum() {
        long sumFactorial = 0;
        long randNum = (int) (Math.random() * 20);//первое рандоиное число
        while (randNum != 0) {
            factorial(randNum);
            sumFactorial += factorial(randNum);
            randNum = (int) (Math.random() * 20);

        }
        System.out.println("Сумма факториала рандомных чисел " + sumFactorial);
    }

    static long factorial(long randNum) {

        if (randNum <= 1) {//если 0 и 1 то факрориал равен 1
            return 1;
        } else {//или высчитфваем факториал через  x * factorial(x - 1) - где factorial(x - 1) повторение метода пока х = 1
            return randNum * factorial(randNum - 1);
        }
    }
}
