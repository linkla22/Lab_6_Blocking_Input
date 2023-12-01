import java.util.Scanner;

public class CtoFconverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsiusTemperature;
        do {
            celsiusTemperature = getValidTemperature(scanner);
            convertAndDisplayTemperature(celsiusTemperature);
            System.out.print("Do you want to convert another temperature? (Y/N): ");
        } while (scanner.next().equalsIgnoreCase("Y"));

        System.out.println("Thanks for using the temperature converter!");
        scanner.close();
    }
    private static double getValidTemperature(Scanner scanner) {
        double temperature;

        do {
            System.out.print("Enter temperature in Celsius: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter temperature in Celsius: ");
                scanner.next();
            }
            temperature = scanner.nextDouble();
        } while (!isValidTemperature(temperature));

        return temperature;
    }
    private static boolean isValidTemperature(double temperature) {
        return temperature >= -273.15;
    }
    private static void convertAndDisplayTemperature(double celsiusTemperature) {
        double fahrenheitTemperature = celsiusToFahrenheit(celsiusTemperature);
        System.out.println(celsiusTemperature + " Celsius is equal to " + fahrenheitTemperature + " Fahrenheit.");
    }
    private static double celsiusToFahrenheit(double celsiusTemperature) {
        return (celsiusTemperature * 9 / 5) + 32;
    }
}
