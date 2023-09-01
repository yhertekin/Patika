import java.util.Scanner;

public class Main {
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int first = scanner.nextInt();

        System.out.print("Enter second number : ");
        int second = scanner.nextInt();

        int gcdResult = gcd(first, second);
        int lcmResult = lcm(first, second);

        System.out.println("GCD : " + gcdResult);
        System.out.println("LCM : " + lcmResult);
    }
}