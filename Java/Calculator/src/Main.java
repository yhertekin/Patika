import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        n1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        n2 = input.nextDouble();

        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.print("Choose action: ");
        select = input.nextInt();

        switch (select) {
            case 1 -> System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
            case 2 -> System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
            case 3 -> System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
            case 4 -> {
                if (n2 != 0) {
                    System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                } else {
                    System.out.println("Cannot divide a number with zero!");
                }
            }
        }
    }
}




















