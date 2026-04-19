package distances;

public class DistPrompts {

    public static String startingPrompt() {

        System.out.println("(M)iles");
        System.out.println("(K)ilometers");
        System.out.println("(F)eet");
        return "";
    }

    public static String lengthPrompt (String lengthScaleBeingConverted) {

        switch (lengthScaleBeingConverted) {
            case "M":
                System.out.println("(K)ilometers");
                System.out.println("(F)eet");
                break;
            case "K":
                System.out.println("(M)iles");
                System.out.println("(F)eet");
                break;
            case "F":
                System.out.println("(M)iles");
                System.out.println("(K)ilometers");
                break;
            default:
                System.out.println("Unsupported input. Please try again.");
        }
        return lengthScaleBeingConverted;
    }

    public static String calculationPrompt (String beginningScale, String endingScale, double length) {
        String comparingScales = beginningScale + " to " + endingScale;
        double result;

        switch (comparingScales) {
            case "M to K":
                result = DistCalculations.milesToKilometers(length);
                System.out.println(String.format("%.2f miles is %.2f kilometers", length, result));
                break;
            case "K to M":
                result = DistCalculations.kilometersToMiles(length);
                System.out.println(String.format("%.2f kilometers is %.2f miles", length, result));
                break;
            case "M to F":
                result = DistCalculations.milesToFeet(length);
                System.out.println(String.format("%.2f miles is %.2f feet", length, result));
                break;
            case "F to M":
                result = DistCalculations.feetToMiles(length);
                System.out.println(String.format("%.2f feet is %.2f miles", length, result));
                break;
            case "K to F":
                result = DistCalculations.kilometersToFeet(length);
                System.out.println(String.format("%.2f kilometers is %.2f feet", length, result));
                break;
            case "F to K":
                result = DistCalculations.feetToKilometers(length);
                System.out.println(String.format("%.2f feet is %.2f kilometers", length, result));
                break;
            default:
                System.out.println("Unsupported input. Please try again.");
        }
        return comparingScales;
    }
}