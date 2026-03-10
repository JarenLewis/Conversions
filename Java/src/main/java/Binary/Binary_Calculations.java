package Binary;

public class Binary_Calculations {
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