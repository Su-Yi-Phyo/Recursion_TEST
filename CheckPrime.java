public class CheckPrime {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(isPrime(n, n - 1));
    }

    public static boolean isPrime(int n, int d) {
        if (d == 1) {
            return true; // base case
        } else if (n % d == 0) {
            return false;
        } else {
            return isPrime(n, d - 1);
        }
    }
}
