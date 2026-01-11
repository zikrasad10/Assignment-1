import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the voltage (in volts): ");
        double voltage = scanner.nextDouble();

        System.out.print("Enter the current (in amperes): ");
        double current = scanner.nextDouble();

        double watts = voltage * current;

        System.out.println("The power is: " + watts + " Watts");

        scanner.close();
    }
}
