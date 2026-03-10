package Distances;

public class Dist_Calculations {

    static final double MILES_PER_KILOMETER = .621371;
    static final double FEET_PER_MILES = 5280;
    static final double FEET_PER_KILOMETERS = 3280.84;

    public static double milesToKilometers(double miles) {
        return miles / MILES_PER_KILOMETER;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers * MILES_PER_KILOMETER;
    }

    public static double milesToFeet (double miles) {
        return miles * FEET_PER_MILES;
    }

    public static double feetToMiles (double feet) {
        return feet / FEET_PER_MILES;
    }

    public static double kilometersToFeet (double kilometers) {
        return kilometers * FEET_PER_KILOMETERS;
    }

    public static double feetToKilometers (double feet) {
        return feet / FEET_PER_KILOMETERS;
    }
}