// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class TriangleArea {
    public static void main(String[] args) {
        
        double a = 3.0;
        double b = 4.0;
        double c = 5.0;

        double s = (a + b + c) / 2.0;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The area of the triangle is: " + area);
    }
}
