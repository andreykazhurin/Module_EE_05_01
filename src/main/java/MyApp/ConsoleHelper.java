package MyApp;

import java.util.Scanner;

/**
 * Created by Andrey on 23.07.2016.
 */
public class ConsoleHelper {
    public String inputStringFromConsole() {
        System.out.println("Input number expression (operations +, -, *, /,). " +
                "Input \"Q\" or \"q\" to quit ");
        Scanner scan = new Scanner(System.in);
        String inputString = scan.next();
        return inputString.toLowerCase();
    }

    public void printToConsole(String input, String result) {
        System.out.println("Result is: " + input + " = " + result);
    }

    public void printErrorToConsole(String input, String message) {
        System.out.println("Wrong input format: " + input + ", error: " + message);
    }
}
