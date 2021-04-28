package nastya.lesson5.homework.task26.householdAppliances.electricKettle;

import nastya.lesson5.homework.task26.householdAppliances.HouseholdAppliances;

public abstract class ElectricKettle extends HouseholdAppliances {

    private String model;
    private int cost;
    private int yearOfRelease;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public ElectricKettle(String model, int cost, int yearOfRelease,int power){
    super(power);
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.cost= cost;

    }

    public void deviceOn(){
        System.out.println(model+" включен в сеть.");
    }

    public void deviceOff(){
        System.out.println(model+" отключен от сети.");
    }

}
