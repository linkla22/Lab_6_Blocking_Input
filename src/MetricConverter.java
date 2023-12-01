import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters;
        do {
            System.out.print("Enter a measurement in meters: ");
            meters = getValidDouble(scanner);
        } while (meters < 0);
        double miles = metersToMiles(meters);
        double feet = metersToFeet(meters);
        double inches = metersToInches(meters);

        System.out.println("Measurement in miles: " + miles);
        System.out.println("Measurement in feet: " + feet);
        System.out.println("Measurement in inches: " + inches);

        scanner.close();
    }
    private static double metersToMiles(double meters) {
        return meters * 0.000621371;
    }
    private static double metersToFeet(double meters) {
        return meters * 3.28084;
    }
    private static double metersToInches(double meters) {
        return meters * 39.3701;
    }
    private static double getValidDouble(Scanner scanner) {
        double value;
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            System.out.print("Enter a valid number: ");
            scanner.next();
        }
        value = scanner.nextDouble();
        return value;
    }

}
