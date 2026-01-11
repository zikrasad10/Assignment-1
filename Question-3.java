// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the original selling price: ");
        double originalPrice = scanner.nextDouble();

        System.out.print("Enter the discount percentage (e.g., 10 for 10%): ");
        double discountPercentage = scanner.nextDouble();

        if (originalPrice < 0 || discountPercentage < 0) {
            System.out.println("Price and discount rate cannot be negative.");
            scanner.close();
            return;
        }


        double discountAmount = (originalPrice * discountPercentage) / 100;

        double discountedPrice = originalPrice - discountAmount;

        System.out.println("\n--- Calculation Results ---");
        System.out.println("Original Price: " + originalPrice);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Discounted Selling Price: " + discountedPrice);

        scanner.close();
    }
}
