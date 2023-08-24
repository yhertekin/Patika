import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pricePerKm = 2.20;
        double openingPrice = 10;
        double minimumPrice = 20;
        double km = 0;
        double price = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter km: ");
        km = input.nextDouble();

        price = km * pricePerKm + openingPrice;
        price = Math.max(price, minimumPrice);

        System.out.println("Price : " + price);

    }
}