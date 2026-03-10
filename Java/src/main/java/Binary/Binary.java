package Binary;

import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("What number would you like to convert to binary?");

            int chosenNumber = input.nextInt();
            System.out.println(chosenNumber + " is " + Binary_Calculations.base10ToBase2(chosenNumber));
            System.out.println("");
        }
    }
}