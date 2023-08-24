import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double perimeter = 0;
        double area = 0;
        double areaOfSlice = 0;
        double angle = 0;
        double r = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        r = input.nextDouble();

        System.out.print("Enter angle: ");
        angle = input.nextDouble();

        perimeter = 2 * Math.PI * r;
        area = Math.PI * r * r;
        areaOfSlice = Math.PI * r * r * angle / 360;

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
        System.out.println("Area of a slice: " + areaOfSlice);
    }
}