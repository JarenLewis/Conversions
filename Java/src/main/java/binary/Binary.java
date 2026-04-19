package binary;

import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("What number would you like to convert to binary? (q to quit)");


            String line = input.nextLine().trim();
            if (line.equalsIgnoreCase("q")) break;


            try {
                int chosenNumber = Integer.parseInt(line);

                System.out.println(chosenNumber + " is " + BinaryCalculations.base10ToBase2(chosenNumber));
                System.out.println();

            }
            catch (NumberFormatException e) {
                System.out.println("Enter a valid integer.");
                System.out.println();
            }
        }
    }
}