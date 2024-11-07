public class CountDigit {
    public static void main(String[] args) {
        int n = 12345;
        int result = calculate(n);
        System.out.println(result);
    }

    public static int calculate(int n) {
        if (n == 0) {
            return 0; // base case
        } else {
            return 1 + calculate(n / 10); // recursive call
        }
    }
}
