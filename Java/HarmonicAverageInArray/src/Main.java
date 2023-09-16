public class Main {
    public static void main(String[] args) {
        double[] arr = {2.5, 3.6, 4.8, 2.0, 5.2};

        double harmonic = harmonicAvg(arr);

        System.out.println("Harmonic Average In Array: " + harmonic);
    }

    public static double harmonicAvg(double[] arr) {
        double sum = 0;

        for (double num : arr) {
            sum += 1.0 / num;
        }

        return arr.length / sum;
    }
}