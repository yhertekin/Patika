import java.util.Scanner;

public class Main {
    static boolean isPrime(int number, int divisor){
        if(number <= 1) {
            return false;
        }
        if(divisor <= 1) {
            return true;
        }
        if(number % divisor == 0) {
            return false;
        }
        return isPrime(number, divisor - 1);
    }
    public static void main(String[] args) {
        int number = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        if(isPrime(number, 2)){
            System.out.println(number + " is prime.");
        }
        else{
            System.out.println(number + " is not prime.");
        }
    }
}