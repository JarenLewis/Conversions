public class Distance {

    static final double MILES_PER_KILOMETER = .621371;


    public static double milesToKilometers(double miles){
        return miles / MILES_PER_KILOMETER;
    }

    public static double kilometersToMiles(double kilometers){
        return kilometers * MILES_PER_KILOMETER;
    }
}