package Distances;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("What do want to convert?");
            Dist_Prompts.startingPrompt();

            String lengthScaleBeingConverted = input.nextLine().toUpperCase();
            System.out.println("");

            if (!lengthScaleBeingConverted.equals("M") && !lengthScaleBeingConverted.equals("K") && !lengthScaleBeingConverted.equals("F")) {
                System.out.println("Unsupported input. Please try again.");
                System.out.println("");
                continue;
            }

            while (true) {

                System.out.println("What is the length?");

                if (!input.hasNextDouble()) {
                    System.out.println("Unsupported input. Please input a number.");
                    System.out.println("");
                    input.nextLine();
                    continue;
                }

                String length = String.valueOf(Double.parseDouble(input.nextLine()));
                System.out.println("");

                double startingLength = Double.parseDouble(length);

//
                while (true) {

                    System.out.println("What length do you want to convert to?");
                    Dist_Prompts.lengthPrompt(lengthScaleBeingConverted);

                    String lengthConvertedTo = input.nextLine().toUpperCase();
                    System.out.println("");
                    Dist_Prompts.calculationPrompt(lengthScaleBeingConverted, lengthConvertedTo, startingLength);
                    System.out.println("");
                    break;
                }
                System.out.println("Do you want to convert another length? (Y/N)");

                String answer = input.nextLine().toUpperCase();

                if (!answer.equals("Y")) {
                    return;
                }
                else break;
            }
            System.out.println("");
        }
    }
}