import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width, height;

        do {
            System.out.print("Enter the width of the rectangle: ");
            width = ValidSideLength(scanner);
            System.out.print("Enter the height of the rectangle: ");
            height = ValidSideLength(scanner);
            displayRectangleInfo(width, height);
            System.out.print("Do you want to enter another rectangle? (Y/N): ");
        } while (scanner.next().equalsIgnoreCase("Y"));

        System.out.println("Thanks for using RectangleInfo!");
        scanner.close();
    }private static double ValidSideLength(Scanner scanner) {
        double sideLength;

        do {
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid number.");
                System.out.print("Enter a valid side length: ");
                scanner.next();
            }
            sideLength = scanner.nextDouble();

            if (sideLength <= 0) {
                System.out.println("Invalid input. Please enter a positive number for side length.");
                System.out.print("Enter a valid side length: ");
            }
        } while (sideLength <= 0);

        return sideLength;
    }

    private static void displayRectangleInfo(double width, double height) {
        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Rectangle Information:");
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
