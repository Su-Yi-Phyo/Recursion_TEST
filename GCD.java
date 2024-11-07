public class GCD {
    public static void main(String[] args) {
        int a = 11, b = 55;
        System.out.println(findGCD(a, b));
    }

    public static int findGCD(int a, int b) {
        if (a % b == 0) {
            return b; // base case
        }

        else {
            return findGCD(b, a % b); // recursive call
        }
    }
}
