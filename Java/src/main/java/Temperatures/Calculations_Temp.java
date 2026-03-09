package Temperatures;

public class Calculations_Temp {
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
}