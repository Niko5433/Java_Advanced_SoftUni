package ExamPrep;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PastryShop {
        private static final int BISCUIT_VALUE = 25;
        private static final int CAKE_VALUE = 50;
        private static final int PASTRY_VALUE = 75;
        private static final int PIE_VALUE = 100;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputLiquids = scanner.nextLine().split("\\s+");


        Deque<Integer> liquids = new ArrayDeque<>();
        for (String liquid: inputLiquids) {
            liquids.offer(Integer.parseInt(liquid));
        }

        String[] inputIngredients = scanner.nextLine().split("\\s+");

        Deque<Integer> ingredients = new ArrayDeque<>();
        for (String ingredient: inputIngredients) {
            ingredients.push(Integer.parseInt(ingredient));
        }

        int countBiscuit = 0, countCake = 0, countPastry = 0, countPie = 0;
        while (!liquids.isEmpty() && !ingredients.isEmpty()){
            Integer liquid = liquids.poll();
            Integer ingredient = ingredients.pop();
            int possiblePastry = liquid + ingredient;

            switch (possiblePastry){
                case BISCUIT_VALUE: countBiscuit++; break;
                case CAKE_VALUE: countCake++; break;
                case PASTRY_VALUE: countPastry++; break;
                case PIE_VALUE: countPie++; break;
                default: ingredients.push(ingredient + 3); break;
            }
        }
        if (countBiscuit > 0 && countCake > 0 && countPastry > 0 && countPie > 0){
            System.out.println("Great! You succeeded in cooking all the food!");
        } else {
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
        }
        System.out.print("Liquids left: ");
        if (liquids.isEmpty()){
            System.out.print("none");
        } else {
            System.out.print(liquids.toString().replaceAll("[\\[\\]]", ""));
        }
        System.out.println();
        System.out.print("Ingredients left: ");
        if (ingredients.isEmpty()){
            System.out.print("none");
        } else {
            System.out.print(ingredients.toString().replaceAll("[\\[\\]]", ""));
        }
        System.out.println();
        System.out.println("Biscuit: " + countBiscuit);
        System.out.println("Cake: " + countCake);
        System.out.println("Pie: " + countPie);
        System.out.println("Pastry: " + countPastry);

    }
}
