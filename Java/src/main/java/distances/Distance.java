package distances;

import java.util.Scanner;

public class Distance {

    private static boolean isConverted(String measurement) {
        return measurement.equalsIgnoreCase("M")
                || measurement.equalsIgnoreCase("K")
                || measurement.equalsIgnoreCase("F");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("What do want to convert?");
            DistPrompts.startingPrompt();

            String lengthScaleBeingConverted = input.nextLine().toUpperCase().trim();
            System.out.println();

            if (!isConverted(lengthScaleBeingConverted)) {
                System.out.println("Unsupported input. Please try again.");
                System.out.println();
                continue;
            }

            double startingLength;

            while (true) {
                System.out.println("What is the length?");
                String line = input.nextLine().trim();

                try {
                    startingLength = Double.parseDouble(line) ;
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Unsupported input. Enter a number.");
                    System.out.println();
                }
            }

            String lengthConvertedTo;
//
            while (true) {
                System.out.println("What length do you want to convert to?");
                DistPrompts.lengthPrompt(lengthScaleBeingConverted);

                lengthConvertedTo = input.nextLine().toUpperCase().trim();
                System.out.println();

                if (!isConverted(lengthConvertedTo) || lengthConvertedTo.equalsIgnoreCase(lengthScaleBeingConverted)) {
                    System.out.println("Unsupported input. Choose between (M/K/F).");
                    System.out.println();
                    continue;
                }
                break;
            }

            DistPrompts.calculationPrompt(lengthScaleBeingConverted, lengthConvertedTo, startingLength);
            System.out.println();
            System.out.println("Do you want to convert another length? (Y/N)");

            String answer = input.nextLine().toUpperCase().trim();

            if (!answer.equals("Y")) {
                return;
            }
            System.out.println();
        }
    }
}