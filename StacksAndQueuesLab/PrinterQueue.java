package StacksAndQueuesLab;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> filesQueue = new ArrayDeque<>();

        while (!input.equals("print")) {
            if (input.equals("cancel")) {
                if (filesQueue.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    String canceledFile = filesQueue.poll();
                    System.out.println("Canceled " + canceledFile);
                }

            } else {
                filesQueue.offer(input);
            }

            input = scanner.nextLine();
        }
        while (!filesQueue.isEmpty()) {
            System.out.println(filesQueue.pollFirst());
        }
    }
}
