package ExamPrep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class EnergyDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> milligramsSequence = new ArrayDeque<>();
        ArrayDeque<Integer> energyDrinkSequence = new ArrayDeque<>();
        int maxCaffeineInput = 300;
        int totCaffeineInput = 0;
        Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).forEach(milligramsSequence::push);
        Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).forEach(energyDrinkSequence::offer);

        while(!milligramsSequence.isEmpty() && !energyDrinkSequence.isEmpty()){
            int currentMilligrams = milligramsSequence.peek();
            int currentEnergyDrink = energyDrinkSequence.peek();
            int currentCalculatedAmount = currentMilligrams * currentEnergyDrink;
            if(currentCalculatedAmount + totCaffeineInput <= maxCaffeineInput){
                totCaffeineInput += currentCalculatedAmount;
                milligramsSequence.pop();
                energyDrinkSequence.poll();
            } else {
                milligramsSequence.pop();
                energyDrinkSequence.poll();
                energyDrinkSequence.offer(currentEnergyDrink);
                if (totCaffeineInput >= 30){
                    totCaffeineInput -= 30;
                }
            }
        }
        if(!energyDrinkSequence.isEmpty()){
            System.out.printf("Drinks left: %s%n", String.join(", ",Arrays.asList(energyDrinkSequence.toString()
                    .substring(1 , energyDrinkSequence.toString().length() - 1))));
        } else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }
        System.out.printf("Stamat is going to sleep with %s mg caffeine.", totCaffeineInput);

    }
}
