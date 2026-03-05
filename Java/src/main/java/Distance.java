import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("What do want to convert? (M)iles or (K)ilometers");
            String lengthBeingConverted = input.nextLine().toUpperCase();

            System.out.println("What is the length?");
            double length = input.nextDouble();
            input.nextLine();

            System.out.println("What do want to convert " + length + " " + lengthBeingConverted + " to? (M)iles or (K)ilometers");
            String lengthConvertedTo = input.nextLine().toUpperCase();

//        if (lengthConvertedTo.equals("M")) {
//            double result = kilometersToMiles(length);
//            System.out.println(length + " kilometers is " + result + " miles");
//        }
//        else if (lengthConvertedTo.equals("K")) {
//            double result = milesToKilometers(length);
//            System.out.println(length + " miles is " + result + " kilometers");
//        }
            if (lengthConvertedTo.equals("M")) {
                double result = kilometersToMiles(length);
                System.out.println(String.format("%.2f kilometers is %.2f miles", length, result));
            } else if (lengthConvertedTo.equals("K")) {
                double result = milesToKilometers(length);
                System.out.println(String.format("%.2f miles is %.2f kilometers", length, result));
            }
            System.out.println("");
        }
        /*
        % start of the format specifier
        . number of decimal places
        2 (ex) two decimal places displayed
        f floating point numbers

        %.2f is the whole placeholder

       First placeholder is for length variable
       Second placeholder is for result variable
         */
    }

    static final double MILES_PER_KILOMETER = .621371;

    public static double milesToKilometers(double miles) {
        return miles / MILES_PER_KILOMETER;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers * MILES_PER_KILOMETER;
    }
}

//Add other measurements
//error handling