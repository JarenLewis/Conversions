package Temperatures;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("What temperature scale would you like to start with?");
            Temp_Prompts.startingScalePrompt();

            String startingScale = input.nextLine().toUpperCase();
            System.out.println("");

            if (!startingScale.equals("F") && !startingScale.equals("C") && !startingScale.equals("K")) {
                System.out.println("Unsupported input. Please try again.");
                System.out.println("");
                continue;
            }

            while (true) {
                System.out.println("What is the temperature?");

                if (!input.hasNextDouble()) {
                    System.out.println("Unsupported input. Please input a number.");
                    System.out.println("");
                    input.nextLine();
                    continue;
                }

                String startingTemp = String.valueOf(Double.parseDouble(input.nextLine()));
                System.out.println("");
                Temp_Prompts.endingScalePrompt(startingScale);


                double startingTempCalc = Double.parseDouble(startingTemp);

                while (true) {
                    String endingScale = input.nextLine().toUpperCase();
                    Temp_Prompts.calculationPrompt(startingScale, endingScale, startingTempCalc, startingTemp);
                    break;
                }
                System.out.println("");
                System.out.println("Do you want to convert another temperature? (Y/N)?");

                String answer = input.nextLine().toUpperCase();
                System.out.println("");
                if (!answer.equals("Y")) {
                    return;
                }
                break;
            }
        }
    }
}