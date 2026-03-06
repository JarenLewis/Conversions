import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("What temperature scale would you like to start with?");
            startingScalePrompt();

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

                endingScalePrompt(startingScale);

                double startingTempCalc = Double.parseDouble(startingTemp);

                while (true) {

                    String endingScale = input.nextLine().toUpperCase();


                    //Create a switch statement



                    if (startingScale.equals("F") && endingScale.equals("C")) {
                        double result = Temperature.fahrenheitToCelsius(startingTempCalc);
                        System.out.println(startingTemp + "°F is " + result + "°C");
                    } else if (startingScale.equals("C") && endingScale.equals("F")) {
                        double result = Temperature.celsiusToFahrenheit(startingTempCalc);
                        System.out.println(startingTemp + "°C is " + result + "°F");
                    } else if (startingScale.equals("K") && endingScale.equals("C")) {
                        double result = Temperature.kelvinToCelsius(startingTempCalc);
                        System.out.println(startingTemp + "°K is " + result + "°C");
                    } else if (startingScale.equals("F") && endingScale.equals("K")) {
                        double result = Temperature.fahrenheitToKelvin(startingTempCalc);
                        System.out.println(startingTemp + "°F is " + result + "°K");
                    } else if (startingScale.equals("C") && endingScale.equals("K")) {
                        double result = Temperature.celsiusToKelvin(startingTempCalc);
                        System.out.println(startingTemp + "°C is " + result + "°K");
                    } else if (startingScale.equals("K") && endingScale.equals("F")) {
                        double result = Temperature.kelvinToFahrenheit(startingTempCalc);
                        System.out.println(startingTemp + "°K is " + result + "°F");
                    } else if (!endingScale.equals("F") && !endingScale.equals("C") && !endingScale.equals("K")) {
                        System.out.println("Unsupported input. Please try again.");
                        System.out.println("");
                        endingScalePrompt(startingScale);
                        continue;
                    }
                }
            }
        }
    }

    public static double celsiusToFahrenheit(double celsius) {
        double calculatedFahrenheit = (celsius * 1.8) + 32;
        return calculatedFahrenheit;
    }

    public static double celsiusToKelvin(double celsius) {
        double calculatedKelvin = celsius + 273.15;
        return calculatedKelvin;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double calculatedCelsius = (fahrenheit - 32) / 1.8;
        return calculatedCelsius;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        double calculatedKelvin = ((fahrenheit - 32) / 1.8) + 273.15;
        return calculatedKelvin;
    }

    public static double kelvinToCelsius(double kelvin) {
        double calculatedCelsius = kelvin - 273.15;
        return calculatedCelsius;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        double calculatedFahrenheit = ((kelvin - 273.15) * 1.8) + 32;
        return calculatedFahrenheit;
    }


    public static String endingScalePrompt(String startingScale) {
        System.out.println("What temperature do you want to convert to?");

        switch (startingScale) {
            case "F":
                System.out.println("(C)elsius");
                System.out.println("(K)elvin");
                break;
            case "C":
                System.out.println("(F)ahrenheit");
                System.out.println("(K)elvin");
                break;
            case "K":
                System.out.println("(F)ahrenheit");
                System.out.println("(C)elsius");
                break;
        }
        return startingScale;
    }

    public  static String startingScalePrompt () {
        System.out.println("(F)ahrenheit");
        System.out.println("(C)elsius");
        System.out.println("(K)elvin");
        return "";
    }
}