import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        n = input.nextInt();

        System.out.print("Enter r: ");
        r = input.nextInt();

        System.out.println("C(n, r) : " + combination(n, r));
    }

    public static int factorial(int a){
        int product = 1;
        for(int i = 1; i <= a; i++){
            product *= i;
        }
        return product;
    }

    public static int combination(int n, int r){
        return factorial(n) / (factorial(r) * factorial(n-r));
    }

}