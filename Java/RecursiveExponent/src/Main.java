public class Main {

    static int exp(int base, int pow) {
        if(pow == 0){
            return 1;
        }
        return base * exp(base, pow-1);
    }
    public static void main(String[] args) {
        System.out.println(exp(3, 3));
    }
}