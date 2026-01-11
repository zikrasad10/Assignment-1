import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Validate radius
        if (radius < 0) {
            System.out.println("Radius cannot be negative.");
            scanner.close();
            return;
        }

        // Calculate circumference and area
        double circumference = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        // Print results
        System.out.printf("Circumference: %.2f\n", circumference);
        System.out.printf("Area: %.2f\n", area);

        scanner.close();
    }
}
