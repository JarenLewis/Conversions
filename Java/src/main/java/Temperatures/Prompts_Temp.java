package Temperatures;

public class Prompts_Temp {

    public static String startingScalePrompt() {
        System.out.println("(F)ahrenheit");
        System.out.println("(C)elsius");
        System.out.println("(K)elvin");
        return "";
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

    public static String calculationPrompt(String startingScale, String endingScale, double startingTempCalc, String startingTemp) {

        String comparingScales = startingScale + " to " + endingScale;
        double result;

        switch (comparingScales) {
            case "F to C":
                result = Calculations_Temp.fahrenheitToCelsius(startingTempCalc);
                System.out.println(startingTemp + "°F is " + result + "°C");
                break;
            case "C to F":
                result = Calculations_Temp.celsiusToFahrenheit(startingTempCalc);
                System.out.println(startingTemp + "°C is " + result + "°F");
                break;
            case "K to C":
                result = Calculations_Temp.kelvinToCelsius(startingTempCalc);
                System.out.println(startingTemp + "°K is " + result + "°C");
                break;
            case "F to K":
                result = Calculations_Temp.fahrenheitToKelvin(startingTempCalc);
                System.out.println(startingTemp + "°F is " + result + "°K");
                break;
            case "C to K":
                result = Calculations_Temp.celsiusToKelvin(startingTempCalc);
                System.out.println(startingTemp + "°C is " + result + "°K");
                break;
            case "K to F":
                result = Calculations_Temp.kelvinToFahrenheit(startingTempCalc);
                System.out.println(startingTemp + "°K is " + result + "°F");
                break;
            default:
                System.out.println("Unsupported input. Please try again.");
                System.out.println("");
                Prompts_Temp.endingScalePrompt(startingScale);
        }
        return comparingScales;
    }
}