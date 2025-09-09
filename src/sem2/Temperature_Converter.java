package sem2;

public class Temperature_Converter {

    /**
     * Converts temperature from Fahrenheit to Celsius.
     * @param fahrenheit Temperature value in Fahrenheit.
     * @return Equivalent temperature value in Celsius.
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    /**
     * Converts temperature from Celsius to Fahrenheit.
     * @param celsius Temperature value in Celsius.
     * @return Equivalent temperature value in Fahrenheit.
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

}

