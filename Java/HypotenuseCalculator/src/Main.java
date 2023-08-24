import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double firstSide, secondSide, hypotenuse, area;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a side: ");
        firstSide = input.nextDouble();

        System.out.print("Enter other side: ");
        secondSide = input.nextDouble();

        hypotenuse = Math.sqrt(Math.pow(firstSide, 2) + Math.pow(secondSide, 2));
        area = (firstSide * secondSide) / 2;

        System.out.println("Hypotenuse : " + hypotenuse);
        System.out.println("Area: " + area);
    }
}