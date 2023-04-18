package SetsAndMapsAdvancedLab;

import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        Map<String, Map<String, Double>> shopProduct = new TreeMap<>();

        while (!input[0].equals("Revision")) {
            String shopName = input[0];
            String product = input[1];
            Double price = Double.parseDouble(input[2]);

            shopProduct.putIfAbsent(shopName, new LinkedHashMap<>());
            Map<String, Double> products = shopProduct.get(shopName);
            products.put(product, price);

            input = scanner.nextLine().split(", ");
        }

        for (Map.Entry<String, Map<String, Double>> entry : shopProduct.entrySet()) {
            System.out.println(entry.getKey() + "->");
            for (Map.Entry<String, Double> goods: entry.getValue().entrySet()) {
                String output = String.format("Product: %s, Price: %.1f", goods.getKey(), goods.getValue());
                System.out.println(output);
            }
        }


    }
}
