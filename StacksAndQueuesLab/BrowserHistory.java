package StacksAndQueuesLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String url = scanner.nextLine();

        ArrayDeque<String> urlStack = new ArrayDeque<>();

        while (!url.equals("Home")) {
            if (url.equals("back")) {
                if (urlStack.isEmpty() || urlStack.size() == 1) {
                    System.out.println("no previous URLs");
                    url = scanner.nextLine();
                    continue;
                }
                urlStack.pop();
            } else {
                urlStack.push(url);
            }
            System.out.println(urlStack.peek());
            url = scanner.nextLine();
        }

    }
}
