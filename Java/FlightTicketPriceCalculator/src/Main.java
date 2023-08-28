import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km;
        int age, tripType;
        double price, discountedPrice;
        double pricePerKm = 0.10;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in km : ");
        km = input.nextDouble();

        System.out.print("Enter age : ");
        age = input.nextInt();

        System.out.println("1-One Direction\n2-Round Trip");
        tripType = input.nextInt();

        if(km < 1 || age < 1 || tripType < 1 || tripType > 2){
            System.out.println("Wrong data provided");
            return;
        }

        price = km * pricePerKm;
        discountedPrice = price;
        if(age < 12){
            discountedPrice = price * 0.5;
        }
        else if(age < 24){
            discountedPrice = price * 0.9;
        }
        else if(age > 65){
            discountedPrice = price * 0.7;
        }
        price = discountedPrice;

        if(tripType == 2){
            discountedPrice = discountedPrice * 0.8;
            price = discountedPrice * 2;
        }

        System.out.println("Total Price : " + price);

    }
}