import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the length of the rectangle:");
            double length = scanner.nextDouble();

            System.out.println("Enter the width of the rectangle:");
            double width = scanner.nextDouble();

            // Calculate area and perimeter
            double area = calculateArea(length, width);
            double perimeter = calculatePerimeter(length, width);

            // Display results
            System.out.println("Area of the rectangle: " + area);
            System.out.println("Perimeter of the rectangle: " + perimeter);

            scanner.close();
        }

        public static double calculateArea(double length, double width) {
            return length * width;
        }

        public static double calculatePerimeter(double length, double width) {
            return 2 * (length + width);
        }
    }

