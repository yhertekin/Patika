public class Main {
      public static void series(int n) {
        if (n <= 0) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        series(n - 5);
        System.out.println(n);
    }
    public static void main(String[] args) {
        series(10);
    }
}