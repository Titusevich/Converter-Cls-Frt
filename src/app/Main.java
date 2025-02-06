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
        double celsius = convertFahrenheitsToCelsius(frt);
        System.out.printf("%nResult is %.1f degrees Celsius.", celsius);
    }

    private static double convertFahrenheitsToCelsius (double frt){
        return (frt - FREEZING_POINT) / DIFF_SCALE;
    }
}
