import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int base, exp, result = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        base = input.nextInt();

        System.out.print("Enter the exponent: ");
        exp = input.nextInt();


        for(int i = 0; i < exp; i++){
            result *= base;
        }

        System.out.println("result: " + result);
    }
}