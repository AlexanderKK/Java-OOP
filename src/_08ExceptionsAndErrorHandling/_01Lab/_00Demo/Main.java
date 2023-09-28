package _08ExceptionsAndErrorHandling._01Lab._00Demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 3;
        int result = 1;

        while(counter-- > 0) {
            String input = scanner.nextLine();

            int number = parseInt(input);
            result *= number;
        }

        System.out.println(result);
    }

    private static int parseInt(String str) {
//        "413" -> (4 * 10 ^ 2) * 10 ^ 1 + 3 * 10 ^ 0
        if(str.isEmpty()) {
            throw new IllegalArgumentException("Unable to parse integer from string \"\"");
        }

        int number = 0, power = 0, radix = 10;
        for (int i = str.length() - 1; i >= 0; i--) {
            char digit = str.charAt(i);

            if(!isDigit(digit)) {
                throw new NumberFormatException("Unable to parse integer from string " + str);
            }

            int value = digit - '0';

            number += value * Math.pow(radix, power++);

            //Check for positive or negative prefix
            char firstToken = str.charAt(0);
            if(i == 1 && "+-".contains(firstToken + "")) {
                if(firstToken == '-') {
                    number *= -1;
                }

                break;
            }
        }
    
        return number;
    }

    private static boolean isDigit(char token) {
        return token >= 48 && token <= 57;
    }

}
