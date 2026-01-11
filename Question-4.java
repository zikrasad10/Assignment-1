import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Original Price Calculator!");

        System.out.print("Enter the discounted selling price: $");
        double discountedPrice = scanner.nextDouble();

        System.out.print("Enter the discount percentage (e.g., for 10% enter 10): ");
        double discountPercentage = scanner.nextDouble();

        double originalPrice = discountedPrice / (1 - (discountPercentage / 100));

        System.out.printf("The original selling price was: $%.2f%n", originalPrice);

        scanner.close();
    }
}
