public class Even {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 8, 2, 3 };
        int size = arr.length;

        System.out.println(countEven(arr, size));
    }

    public static int countEven(int[] arr, int size) {
        if (size == 0) {
            return 0;
        }

        return ((arr[size - 1] % 2 == 0) ? 1 : 0) + countEven(arr, size - 1);
    }
}
