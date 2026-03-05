import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("What number would you like to convert to binary?");

            int chosenNumber = input.nextInt();
            System.out.println(chosenNumber + " is " + base10ToBase2(chosenNumber));
            System.out.println("");
        }
    }

    public static String base10ToBase2(int chosenNumber) {

        StringBuilder binaryString = new StringBuilder();

        while (chosenNumber > 0) {
            int remainder = chosenNumber % 2;
            binaryString.insert(0, remainder);
            chosenNumber = chosenNumber / 2;
        }
        return (binaryString.toString());
    }
}

//Eventually separate by 3 chunk increments
//Binary to int