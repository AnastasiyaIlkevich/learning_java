package nastya.lesson5.homework.task26;

import nastya.lesson5.homework.task26.householdAppliances.electricKettle.model.Redmond;
import nastya.lesson5.homework.task26.householdAppliances.electricKettle.model.Bosch;

public class Task26 {

    //Задание 26
    //Создать иерархию классов, описывающих бытовую технику. Создать несколько
    //объектов описанных классов, часть из них включить в розетку.
    //Иерархия должна иметь хотя бы три уровня.

/*
*             --abs class HouseholdAppliances
*               --abs class ElectricKettle
*                 -- class LG
*                 -- class Samsung
*   аналогично  --abs class Television
*   аналогично    -- class LG
*   аналогично    -- class Samsung

* */

    public static void main(String[] args) {

        Redmond redmond = new Redmond("SkyKettle RK-M216S",99,2020,2200);
        Bosch bosch = new Bosch("Bosch TWK8611P",197,2021,2400);

        System.out.println(redmond);
        System.out.println(bosch);
        bosch.deviceOn();
        bosch.powerConsumption();
        redmond.deviceOff();

    }

}
