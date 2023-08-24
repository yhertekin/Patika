import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Product[] products = {
                new Product("Armut", 2.14),
                new Product("Elma", 3.67),
                new Product("Domates", 1.11),
                new Product("Muz", 0.95),
                new Product("Patlıcan", 5.0),
        };

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.print(products[i].name + " - Weight : ");
            Basket.addToBasket(products[i], input.nextDouble());
        }

        System.out.println("Total Price : " + Basket.price);
    }
    public static class Product{
        String name;
        double price;
        public Product(String name, double price){
            this.name  = name;
            this.price = price;
        }
    }

    public static class Basket{
        static double price = 0;
        public static void addToBasket(Product product, double kg){
            price += (product.price * kg);
        }
    }
}