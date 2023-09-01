import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (odd): ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }

        int spaces = n / 2;
        int stars = 1;

        // Upper half of the diamond
        for (int i = 1; i <= n / 2 + 1; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }

        // Lower half of the diamond
        spaces = 1;
        stars = n - 2;

        for (int i = n / 2; i >= 1; i--) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces++;
            stars -= 2;
        }
    }
}