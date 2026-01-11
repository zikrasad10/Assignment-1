import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of parallel side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter length of parallel side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter height h: ");
        double h = scanner.nextDouble();

        double area = h * (a + b) / 2;

        System.out.println("The area of the trapezoid is: " + area);

        scanner.close();
    }
}
