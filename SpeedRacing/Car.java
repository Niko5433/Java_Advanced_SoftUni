package SpeedRacing;

public class Car {
    //Model, fuel amount, fuel cost for 1 kilometer, and distance traveled
    private String car;
    private double fuelAmount;
    private double fuelCostForKm;
    private int distance;

    public Car(String car, double fuelAmount, double fuelCostForKm) {
        this.car = car;
        this.fuelAmount = fuelAmount;
        this.fuelCostForKm = fuelCostForKm;
        this.distance = 0;
    }

    public boolean drive(int kmToDrive) {

        double neededFuel = kmToDrive * this.fuelCostForKm;
        if (neededFuel <= this.fuelAmount) {
            this.fuelAmount -= neededFuel;
            this.distance += kmToDrive;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", this.car, this.fuelAmount, this.distance);
    }
}
