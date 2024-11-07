public class Factorial {

    public static void main(String[] args) {
        System.out.println(findFactorial(4));
    }

    public static int findFactorial(int n) {
        if (n == 0 || n == 1) { // base case
            return 1;
        } else {
            return n * findFactorial(n - 1); // recursive call
        }
    }
}