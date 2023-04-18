package SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Car> carsList = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            //"{Model} {FuelAmount} {FuelCostFor1km}",
            String[] carData = scanner.nextLine().split("\\s+");
            String model = carData[0];
            Double fuelAmount = Double.parseDouble(carData[1]);
            Double fuelCostForKm = Double.parseDouble(carData[2]);

            Car car = new Car(model, fuelAmount, fuelCostForKm);
            carsList.put(model, car);

        }

        String command = scanner.nextLine();
        while (!command.equals("End")){
            //"Drive {CarModel} {amountOfKm}"
            String carModelToDrive = command.split("\\s+")[1];
            int kmToDrive = Integer.parseInt(command.split("\\s+")[2]);

            Car carToDrive = carsList.get(carModelToDrive);

            if(!carToDrive.drive(kmToDrive)){
                System.out.println("Insufficient fuel for the drive");
            }
            command = scanner.nextLine();
        }

        for (Car car : carsList.values()) {
            System.out.println(car.toString());
        }

    }
}
