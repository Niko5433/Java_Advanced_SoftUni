package CarSalesman;

public class Engine {
    //a model, power, (displacement, and efficiency)
    private String engineModel;
    private int power;
    //optional:
    private int displacement;
    private String efficiency;

    public Engine(String engineModel, int power, int displacement, String efficiency) {
        this.engineModel = engineModel;
        this.power = power;
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public int getPower() {
        return power;
    }

    public int getDisplacement() {
        return displacement;
    }

    public String getEfficiency() {
        return efficiency;
    }
}
