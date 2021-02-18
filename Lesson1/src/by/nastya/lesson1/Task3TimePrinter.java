package by.nastya.lesson1;

public class Task3TimePrinter {
    public static void main(String[] args) {
        //Задание
        //Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
        //А) минут + секунд,
        //В) часов + минут + секунд,
        //С) дней + часов + минут + секунд,
        //D) недель + дней + часов + минут + секунд.
        //по аналогии с примером выше.
        //--------------------------------------------------
        int minutes, hours, days, weeks;
        int remainsSeconds, remainsMinutes, remainsHours, remainsDays, verify;
        int seconds = 4500;
        remainsSeconds = seconds % 60;
        minutes = (seconds - remainsSeconds) / 60;
        System.out.println("А) " + minutes + " minutes, " + remainsSeconds + " seconds.");

        remainsMinutes = minutes % 60;
        hours = (minutes - remainsMinutes) / 60;
        System.out.println("B) " + hours + " hours, " + remainsMinutes + " minutes, " + remainsSeconds + " seconds.");

        remainsHours = hours % 24;
        days = (hours - remainsHours) / 24;
        System.out.println("C) " + days + " days, " + remainsHours + " hours, " + remainsMinutes + " minutes, " + remainsSeconds + " seconds.");

        remainsDays = days % 7;
        weeks = (days - remainsDays) / 7;
        System.out.println("D) " + weeks + " weeks, " + remainsDays + " days, " + remainsHours + " hours, " + remainsMinutes + " minutes, " + remainsSeconds + " seconds.");
        //проверка
        verify = weeks * 7 * 24 * 60 * 60 + remainsDays * 24 * 60 * 60 + remainsHours * 60 * 60 + remainsMinutes * 60 + remainsSeconds;
        System.out.println("verify " + (verify - seconds));//0-правильно.
    }
}
