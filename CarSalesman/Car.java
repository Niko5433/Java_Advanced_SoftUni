package CarSalesman;

public class Car {
    //model, engine, (weight, and color)
    private String carModel;
    private Engine engine;
    //optional:
    private int weight;
    private String color;

    public Car(String carModel, Engine engine, int weight, String color) {
        this.carModel = carModel;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.carModel).append(":").append(System.lineSeparator());
        sb.append(this.engine.getEngineModel()).append(":").append(System.lineSeparator());
        sb.append("Power: ").append(this.engine.getPower()).append(System.lineSeparator());
        sb.append("Displacement: ");
        if (this.engine.getDisplacement() == 0) {
            sb.append("n/a").append(System.lineSeparator());
        } else {
            sb.append(this.engine.getDisplacement()).append(System.lineSeparator());
        }
        sb.append("Efficiency: ");
        if (this.engine.getEfficiency() == null) {
            sb.append("n/a").append(System.lineSeparator());
        } else {
            sb.append(this.engine.getEfficiency()).append(System.lineSeparator());
        }
        sb.append("Weight: ");
        if (this.weight == 0) {
            sb.append("n/a").append(System.lineSeparator());
        } else {
            sb.append(this.weight).append(System.lineSeparator());
        }
        sb.append("Color: ");
        if (this.color == null) {
            sb.append("n/a").append(System.lineSeparator());
        } else {
            sb.append(this.color).append(System.lineSeparator());
        }

        return sb.toString();
    }
}
