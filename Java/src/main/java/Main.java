import java.util.Scanner;


/*
Round to 2 decimal places
Add in more options in .contains
reroute to beginning
if the word is not in the .contains reroute to try again
The continue works but it goes to the beginning and not where I want it to repeat the last question if there is a mis input.



Trying out repository
*/


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
    while (true) {
        System.out.println("");
        System.out.println("What would you like to convert?");
        String beginningConversionUnit = input.nextLine();
        String endingNumber = "";
        String beginningNumber = "";
//        String[] usableWords = {"miles", "kilometers", "f", "c", "k"};

//        try {


            if (beginningConversionUnit.equals("miles") || beginningConversionUnit.equals("kilometers")) {

                System.out.println("How many " + beginningConversionUnit + "?");
                beginningNumber = input.nextLine();
                double startingNumber = Double.parseDouble(beginningNumber);

                System.out.println("What would you like to convert " + startingNumber + " " + beginningConversionUnit + " to?");
                endingNumber = input.nextLine();


                if (beginningConversionUnit.equals("miles") && (endingNumber.equals("kilometers") || endingNumber.equals("km"))) {
                    double result = Distance.milesToKilometers(startingNumber);
                    System.out.println(beginningNumber + " " + beginningConversionUnit + " is " + result + " kilometers");
                } else if (beginningConversionUnit.equals("kilometers") && endingNumber.equals("miles")) {
                    double result = Distance.kilometersToMiles(startingNumber);
                    System.out.println(startingNumber + " " + beginningConversionUnit + " equals " + result + " " + endingNumber);
                }
                else {
                    System.out.println("Unsupported conversion. Please try again.");
                }
                continue;

            } else if (beginningConversionUnit.equals("f") || beginningConversionUnit.equals("c") || beginningConversionUnit.equals("k")) {
                System.out.println("What is the temperature?");
                beginningNumber = input.nextLine();
                double startingNumber = Double.parseDouble(beginningNumber);


                System.out.println("What would you like to convert " + beginningNumber + "°" + beginningConversionUnit.toUpperCase() + " to?");
                String endingScale = input.nextLine();

                if (beginningConversionUnit.equals("f") && endingScale.equals("c")) {
                    double result = Temperature.fahrenheitToCelsius(startingNumber);
                    System.out.println(beginningNumber + "°F is " + result + "°C");
                } else if (beginningConversionUnit.equals("c") && endingScale.equals("f")) {
                    double result = Temperature.celsiusToFahrenheit(startingNumber);
                    System.out.println(beginningNumber + "°C is " + result + "°F");
                } else if (beginningConversionUnit.equals("k") && endingScale.equals("c")) {
                    double result = Temperature.kelvinToCelsius(startingNumber);
                    System.out.println(beginningNumber + "°K is " + result + "°C");
                } else if (beginningConversionUnit.equals("f") && endingScale.equals("k")) {
                    double result = Temperature.fahrenheitToKelvin(startingNumber);
                    System.out.println(beginningNumber + "°F is " + result + "°K");
                } else if (beginningConversionUnit.equals("c") && endingScale.equals("k")) {
                    double result = Temperature.celsiusToKelvin(startingNumber);
                    System.out.println(beginningNumber + "°C is " + result + "°K");
                } else if (beginningConversionUnit.equals("k") && endingScale.equals("f")) {
                    double result = Temperature.kelvinToFahrenheit(startingNumber);
                    System.out.println(beginningNumber + "°K is " + result + "°F");
                }
                else {
                    System.out.println("Unable to understand your conversion. Please try again.");
                }
                continue;
            }
//        else if (!beginningConversionUnit.equals(usableWords)) {
//            for (int i = 0; i < usableWords.length; i++){
//                System.out.println("Did not understand. Please try again.");
//            }
//        }
//        } catch (IllegalArgumentException e) {
//            throw new IllegalArgumentException("Unable to Understand");
//        }
            System.out.println("");

            if(!beginningConversionUnit.equals("miles") || !beginningConversionUnit.equals("kilometers") || !beginningConversionUnit.equals("km"))
            {
                System.out.println("Unable to convert " + beginningConversionUnit);
                continue;
            }

            System.out.println("Would you like to convert anything else?");
            String nextConversion = input.nextLine();
            if (!nextConversion.equals("yes")){
                System.out.println("See ya next time!");

                break;
            }
//            else {
//                System.out.println("I wasn't able to understand. Please try again.");
//            }

        }

    }

}


//public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("What would you like to convert to? (F/C)");
//        String userInput = input.nextLine().toUpperCase();
//
//        if (userInput.equals("F")) {
//            System.out.println("What temperature in Celsius would you like to convert to Fahrenheit?");
//
//        } else if (userInput.equals("C")) {
//            System.out.println("What temperature in Fahrenheit would you like to convert to Celsius?");
//        }
//        double userInputTemp = input.nextDouble();
//
//        if (userInput.equals("F")) {
//            System.out.println(userInputTemp + "°" + "C is " + celsiusToFahrenheit(userInputTemp) + "°" + "F");
//        } else if (userInput.equals("C")) {
//            System.out.println(userInputTemp + "°" + "F is " + fahrenheitToCelsius(userInputTemp) + "°" + "C");
//        }
//    }
//
//        public static double fahrenheitToCelsius (double fahrenheit) {
//
//        double celsiusTemp = (fahrenheit - 32) / 1.8;
//        return celsiusTemp;
//        }
//
//        public static double celsiusToFahrenheit (double celsius) {
//
//            double fahrenheitTemp = celsius * 1.8 + 32;
//            return fahrenheitTemp;
//        }