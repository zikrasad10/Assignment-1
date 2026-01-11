import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number % 2 == 0) {
            System.out.println("*EVEN*");
        } else {
            System.out.println("*ODD*");
        }
    }
}
