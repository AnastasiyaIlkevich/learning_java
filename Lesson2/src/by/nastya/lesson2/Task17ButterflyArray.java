package by.nastya.lesson2;

public class Task17ButterflyArray {
    //Задание 17
    //Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
    //таким образом:
    //1 1 1 1 1
    //0 1 1 1 0
    //0 0 1 0 0
    //0 1 1 1 0
    //1 1 1 1 1

    public static void main(String[] args) {
        butterflyArray1();
        System.out.println();
//        butterflyArray2();//не мое решение(((
    }

//    private static void butterflyArray2() {
//
//        int[][] butterfly2 = new int[6][6];
//        int i, j;
//
//        for (i = 0; i < butterfly2.length / 2 + 1; i++) {//строки делим на 2
//            for (j = 0; j < butterfly2[i].length; j++) {//butterfly2[i].length - колл элементов в строке
//                if ((j < i) || (j >= (butterfly2[i].length - i)))//условие заполнения 0/1
//                    butterfly2[i][j] = 0;
//                else
//                    butterfly2[i][j] = 1;
//            }
//        }
//        for (i = butterfly2.length - 1; i >= butterfly2.length / 2; i--) {//заполнение зеркало
//            for (j = 0; j < butterfly2[i].length; j++) {
//                if ((j < (butterfly2[i].length - 1 - i)) || (j > i))
//                    butterfly2[i][j] = 0;
//                else
//                    butterfly2[i][j] = 1;
//            }
//        }
//        for (i = 0; i < butterfly2.length; i++) {
//            for (j = 0; j < butterfly2[i].length; j++) {
//                System.out.print(butterfly2[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }


    private static void butterflyArray1() {
        int[][] butterfly = {
                {1, 1, 1, 1, 1},
                {0, 1, 1, 1, 0},
                {0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0},
                {1, 1, 1, 1, 1}
        };
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 5; j++)
                System.out.print(butterfly[i][j] + " ");
            System.out.println();
        }
    }
}
