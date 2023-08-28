import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double temperature = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Temperature : ");
        temperature = input.nextDouble();

        if(temperature < 5){
            System.out.println("Go skiing");
        }
        else if(temperature < 15){
            System.out.println("Go to the movies");
        }
        else if(temperature < 25){
            System.out.println("Go picnic");
        }
        else {
            System.out.println("Go swimming");
        }
    }
}