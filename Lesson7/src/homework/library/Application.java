package homework.library;

import java.util.Scanner;

public class Application {
    Scanner scanner = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);

    //метод старт
    public void startProgram() throws InterruptedException {
        System.out.println("""
                Добро пожаловать в главное меню\s
                Ваши дальнейшие действия (введите цыфру для дальнейшей работы)\s
                1. Вывод всех книг асортимента.\s
                2. Добавление книги (пополнение асортимента).\s
                3. Удаление книги.\s
                4. Редоктирование книги.\s
                5. Выход (Окончание работ в системе интернет магазина).\s""");


        int programMode = scanner.nextInt();

        switch (programMode) {
            case 1://Вывод всех книг асортимента.
                System.out.println("""
                        Ваши дальнейшие действия (введите цыфру для дальнейшей работы)\s
                        1. Вывод всех книг асортимента от А до Я.\s
                        2. Вывод всех книг асортимента от Я до А.\s""");
                int sortList = scanner.nextInt();
                Library.sortBook(sortList);
                break;

            case 2://Добавление книги (пополнение асортимента).
                // вводим title id
                System.out.println("Введите название книги");
                String titleBook = scanner2.nextLine();
                System.out.println("Введите название книги");
                int idBook = scanner.nextInt();
                //создается объект книги
                //добавляем книгу
                Library.addBook(new Book(idBook, titleBook));
                break;

            case 3://Удаление книги.
                System.out.println("Введите ID для удаления из базы книги.");
                int idDel = scanner.nextInt();
                Library.delBook(idDel);
                System.out.println("Операция удаления книги с ID=" + idDel + " проведена успешно.");
                break;

            case 4://Редоктирование книги.
                System.out.println("Введите ID книги для корректировки---> ");
                int idCorrectionBook = scanner.nextInt();
                Library.bookCorrection(idCorrectionBook);
                break;

        }

        if (!(programMode == 5)) {
            finishProgram();
        } else {
            System.out.println("Выход (Окончание работ в системе интернет магазина).");
        }
    }

    private void finishProgram() throws InterruptedException {
        System.out.println("""
                Желаете ли продолжить?\s
                1. Да.\s
                2. Нет\s""");
        int finish = scanner.nextInt();
        if (finish == 1) {
            startProgram();
        } else {
            System.out.println("Выход (Окончание работ в системе интернет магазина).");
        }
    }
}
