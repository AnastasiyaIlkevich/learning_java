package nastya.lesson5.homework.task26.householdAppliances.electricKettle.model;

import nastya.lesson5.homework.task26.householdAppliances.electricKettle.ElectricKettle;

public class Bosch extends ElectricKettle {


    public Bosch(String model, int cost, int yearOfRelease, int power){
        super( model, cost, yearOfRelease,power);
    }

    @Override
    public String toString() {
        return "Электрочайник Samsung --> модель - "+getModel()+ ", "+ getYearOfRelease()+" года выпуска," +
                " цена: "+ getCost()+ " руб.";
    }

    @Override
    public void powerConsumption() {
        System.out.println("Потребляемая мощность "+ getPower());
    }
}
