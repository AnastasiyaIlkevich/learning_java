package nastya.lesson3.homework;

import java.util.Random;
import java.util.Scanner;

public class GameX0 {

    public static void main(String[] args) {

        boolean finish = true;
        int i;
        int j;
        int count = 0;
        String[][] array = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};//инициализация массива
        for (i = 0; i < 3; i++) {//визуализация массива
            for (j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы ходите первым. Выберите координату от 1 до 9 куда поставите Х?");
        do {
            String playerMove = scanner.nextLine();//ход игрока
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    if (array[i][j].equals(playerMove)) {//поиск в массиве координаты
                        array[i][j] = "X";
                        count++;
                    }
                }
            }
            if ((array[0][0].equals(array[1][1]) && array[0][0].equals(array[2][2])) || (array[0][2].equals(array[1][1]) && array[0][2].equals(array[2][0]))
                    || (array[0][0].equals(array[0][1]) && array[0][0].equals(array[0][2])) || (array[1][0].equals(array[1][1]) && array[1][0].equals(array[1][2])) || (array[2][0].equals(array[2][1]) && array[2][0].equals(array[2][2]))
                    || (array[0][0].equals(array[1][0]) && array[0][0].equals(array[2][0])) || (array[0][1].equals(array[1][1]) && array[0][1].equals(array[2][1])) || (array[0][2].equals(array[1][2]) && array[0][2].equals(array[2][2]))) {
                System.out.println("Поздравляю! Вы победили! ");// проверка
                finish = false;
            } else if (count == 5) {//макс число ходов за Х ==5
                System.out.println("Это ничья. ");
                finish = false;
            }

            if (finish == true) {//если проверка прошла, то дальше код выполняться не будет
                int a;
                int b;
                do {
                    a = random.nextInt(3);//рандомный ход компа
                    b = random.nextInt(3);
                }
                while (array[a][b].equals("X") || array[a][b].equals("0"));//проверка-цикл есть там Х или 0
                array[a][b] = "0";//перезаписываем ячейку массива
                for (i = 0; i < 3; i++) {
                    for (j = 0; j < 3; j++) {
                        System.out.print(array[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Ваш следующий ход! ");//дальше проверка робота
                if ((array[0][0].equals(array[1][1]) && array[0][0].equals(array[2][2])) || (array[0][2].equals(array[1][1]) && array[0][2].equals(array[2][0]))
                        || (array[0][0].equals(array[0][1]) && array[0][0].equals(array[0][2])) || (array[1][0].equals(array[1][1]) && array[1][0].equals(array[1][2])) || (array[2][0].equals(array[2][1]) && array[2][0].equals(array[2][2]))
                        || (array[0][0].equals(array[1][0]) && array[0][0].equals(array[2][0])) || (array[0][1].equals(array[1][1]) && array[0][1].equals(array[2][1])) || (array[0][2].equals(array[1][2]) && array[0][2].equals(array[2][2]))) {
                    System.out.println("Во время игры нужно думать... Вы проиграли... ");
                    finish = false;
                }
            }
        } while (finish);

        for (i = 0; i < 3; i++) {//визуализация массива
            for (j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Игра окончена");
    }

}