import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gallonsInTank, fuelEfficiency, gasPrice;
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            gallonsInTank = getValidDouble(scanner);
        } while (gallonsInTank <= 0);
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            fuelEfficiency = getValidDouble(scanner);
        } while (fuelEfficiency <= 0);
        do {
            System.out.print("Enter the price of gas per gallon: ");
            gasPrice = getValidDouble(scanner);
        } while (gasPrice <= 0);
        double costPer100Miles = (100 / fuelEfficiency) * gasPrice;
        double distance = gallonsInTank * fuelEfficiency;
        System.out.println("Cost per 100 miles: $" + costPer100Miles);
        System.out.println("Distance the car can go with the gas in the tank: " + distance + " miles");
        scanner.close();
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
