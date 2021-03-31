package nastya.lesson5.homework.task25;

import java.util.Scanner;


public class ATMMachine {
    static Scanner scanner = new Scanner(System.in);

    int denominationBanknotes20;    // = 40;
    int denominationBanknotes50;    // = 20;
    int denominationBanknotes100;   // = 100;
    boolean performingOperation = true;    //true...

    public ATMMachine(int denominationBanknotes20, int denominationBanknotes50, int denominationBanknotes100) {
        this.denominationBanknotes20 = denominationBanknotes20;
        this.denominationBanknotes50 = denominationBanknotes50;
        this.denominationBanknotes100 = denominationBanknotes100;
    }

    // вывод денег из банкомата
    public void cashingOut() {
        while (performingOperation) {
            int count100 = 0;
            int count50 = 0;
            int count20 = 0;
            System.out.println("ВВедите сумму");
            int amount = scanner.nextInt();
            System.out.println("Вы ввели " + amount);

            if (amount == 10 || amount == 30) {
                System.out.println("В банкомате отсутствует номинал стоимостью 10 и 30.");
                cashingOut();
            }

            int prov = amount;

            withdrawalOfMoney(amount, prov, count20, count50, count100);
        }
    }

    public void cashCollection() {
        System.out.println("Проводится техническое обслуживание банкомата. Загрузка денег в сейф.");
        System.out.println("ВВедите колличество купюр наминалом 100 для пополнения сейфа");
        int banknotes100 = scanner.nextInt();
        denominationBanknotes100 = denominationBanknotes100 + banknotes100;
        System.out.println("ВВедите колличество купюр наминалом 50 для пополнения сейфа");
        int banknotes50 = scanner.nextInt();
        denominationBanknotes50 = denominationBanknotes50 + banknotes50;
        System.out.println("ВВедите колличество купюр наминалом 20 для пополнения сейфа");
        int banknotes20 = scanner.nextInt();
        denominationBanknotes20 = denominationBanknotes20 + banknotes20;
        System.out.printf("В имеется %d купюр наминалом 100, %d купюр наминалом 50, %d купюр наминалом 20", denominationBanknotes100, denominationBanknotes50, denominationBanknotes20);

    }

    private void withdrawalOfMoney(int amount, int prov, int count20, int count50, int count100) {

        if (amount / 10 % 2 == 0) {
            evenSum(amount, prov, count20, count50, count100);
        } else if (amount / 10 % 2 != 0) {
            oddSum(amount, prov, count20, count50, count100);
        }

    }

    //для вывода нечетной суммы
    private void oddSum(int amount, int prov, int count20, int count50, int count100) {

        while (200 < amount) {
            if (denominationBanknotes100 == 0) {
                break;
            }
            denominationBanknotes100 = denominationBanknotes100 - 1;
            count100++;
            amount = amount - 100;
        }

        while (50 <= amount) {
            if (amount == 60 || amount == 80) {
                break;
            }
            if (denominationBanknotes50 == 0) {
                break;
            }
            denominationBanknotes50 = denominationBanknotes50 - 1;
            count50++;
            amount = amount - 50;
        }

        while (20 <= amount) {
            if (denominationBanknotes50 == 0) {
                break;
            }
            denominationBanknotes20 = denominationBanknotes20 - 1;
            count20++;
            amount = amount - 20;
        }

        information(prov, count20, count50, count100);

    }

    //для вывода четной суммы
    private void evenSum(int amount, int prov, int count20, int count50, int count100) {

        while (100 <= amount) {
            if (denominationBanknotes100 == 0) {
                break;
            }
            denominationBanknotes100 = denominationBanknotes100 - 1;
            count100++;
            amount = amount - 100;
        }

        while (50 <= amount) {
            if (amount == 60 || amount == 80) {
                break;
            }
            if (denominationBanknotes50 == 0) {
                break;
            }
            denominationBanknotes50 = denominationBanknotes50 - 1;
            count50++;
            amount = amount - 50;
        }

        while (20 <= amount) {
            if (denominationBanknotes20 == 0) {
                break;
            }
            denominationBanknotes20 = denominationBanknotes20 - 1;
            count20++;
            amount = amount - 20;
        }

        information(prov, count20, count50, count100);

    }

    //вывод информации по операциям.
    private void information(int prov, int count20, int count50, int count100) {

        if (count100 * 100 + count50 * 50 + count20 * 20 == prov) {
            System.out.println(performingOperation);
            System.out.printf("Вы вывели %d купюр наминалом 100, %d купюр наминалом 50, %d купюр наминалом 20", count100, count50, count20);
            System.out.println();
            System.out.printf("В банкомате осталось %d купюр наминалом 100, %d купюр наминалом 50, %d купюр наминалом 20", denominationBanknotes100, denominationBanknotes50, denominationBanknotes20);
            System.out.println();
        } else {
            System.out.println("В банкомате недостаточно средств. Требуется сервестное обслуживание");
            denominationBanknotes20 = denominationBanknotes20 + count20;
            denominationBanknotes50 = denominationBanknotes50 + count50;
            denominationBanknotes100 = denominationBanknotes100 + count100;
            System.out.printf("В банкомате осталось %d купюр наминалом 100, %d купюр наминалом 50, %d купюр наминалом 20", denominationBanknotes100, denominationBanknotes50, denominationBanknotes20);
            performingOperation = false;
            System.out.println();
            System.out.println(performingOperation);
        }
    }
}

