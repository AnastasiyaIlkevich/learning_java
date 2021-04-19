package nastya.lesson5.homework.task26.householdAppliances;

public abstract class HouseholdAppliances {

    private int power;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public HouseholdAppliances(int power) {
        this.power=power;
    }




    public abstract void powerConsumption();

}
