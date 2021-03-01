package by.nastya.lesson2;

import java.util.Scanner;

public class Task7CheckRectangle {
    //Задание 7
    //Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
    //полностью закрыть круглой картонкой радиусом r.

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите длинну прямоугольного отверстия:");
        double length = scanner.nextDouble();
        System.out.println("Введите ширину прямоугольного отверстия:");
        double width = scanner.nextDouble();
        System.out.println("Введите радиус круга:");
        double radius = scanner.nextDouble();
        checkingTheRectangle(length, width, radius);
    }

    public static void checkingTheRectangle(double length, double width, double radius) {

        if (2 * radius > width && 2 * radius > length) {
            System.out.println("True - наибольшая сторона прямоугольника меньше чем диаметр круга = " + radius * 2);
        } else {
            System.out.println("False - наибольшая сторона прямоугольника больше чем диаметр круга = " + radius * 2);
        }
    }
}
