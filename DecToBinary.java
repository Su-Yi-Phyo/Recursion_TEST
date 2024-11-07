public class DecToBinary {

    public static void main(String[] args) {
        int dec = 8;
        System.out.println(decBinary(dec));
    }

    public static int decBinary(int dec) {
        if (dec == 0) {
            return 0;
        }

        return 10 * decBinary(dec / 2) + (dec % 2);
    }
}