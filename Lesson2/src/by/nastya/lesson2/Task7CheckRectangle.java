package by.nastya.lesson2;

import java.util.Scanner;

public class Task7CheckRectangle {
    //Задание 7
    //Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
    //полностью закрыть круглой картонкой радиусом r.

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите размер стороны \"a\" прямоугольника:");
        double a = scanner.nextDouble();
        System.out.println("Введите размер стороны \"b\" прямоугольника:");
        double b = scanner.nextDouble();
        System.out.println("Введите размер радиуса \"r\" круга:");
        double r = scanner.nextDouble();
        checkingTheRectangle(a, b, r);
    }

    public static void checkingTheRectangle(double a, double b, double r) {

        if (2 * r > b && 2 * r > a) {
            System.out.println("True - наибольшая сторона прямоугольника меньше чем диаметр круга = " + r * 2);
        } else {
            System.out.println("False - наибольшая сторона прямоугольника больше чем диаметр круга = " + r * 2);
        }
    }
}
