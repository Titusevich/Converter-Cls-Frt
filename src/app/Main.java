package app;

import java.util.Scanner;

public class Main {

    public static final double FREEZING_POINT = 32;
    public static final double DIFF_SCALE = 1.8;

    public static void main(String[] args) {
        System.out.println("Converter of temperature units.");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter amount of degrees in Fahrenheit: ");
        double frt = scan.nextDouble();
        System.out.print("Enter amount of degrees in Celsius: ");
        double cls = scan.nextDouble();
        double celsius = convertFahrenheitsToCelsius(frt);
        double fahrenheit = convertCelsiusToFahrenheits(cls);
        System.out.printf("%nResult is %.1f degrees Celsius " +
                        "and %.1f degrees Fahrenheit.",
                celsius, fahrenheit);
    }

    private static double convertFahrenheitsToCelsius(double frt) {
        return (frt - FREEZING_POINT) / DIFF_SCALE;
    }

    private static double convertCelsiusToFahrenheits(double cls) {
        return cls * DIFF_SCALE + FREEZING_POINT;
    }
}
