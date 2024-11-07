public class Sum {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 8, 2, 3 };
        int size = arr.length;

        System.out.println(findSum(arr, size));
    }

    public static int findSum(int[] arr, int size) {
        if (size == 1) {
            return arr[0];
        }

        return arr[size - 1] + findSum(arr, size - 1);
    }
}
