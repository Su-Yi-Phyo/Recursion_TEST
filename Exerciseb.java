public class Exerciseb {
    public static void main(String[] args) {
        int x = 2, n = 3;
        System.out.println(calculate(x, n));
    }

    public static double calculate(int x, int n) {

        if (n == 0) {
            return 1; // base case
        } else {
            return x * calculate(x, n - 1); // recursive call
        }
    }
}
