public class Min {

    public static void main(String[] args) {
        int[] arr = { 7, 5, 8, 2, 3 };
        int size = arr.length;

        System.out.println(findMin(arr, size));
    }

    public static int findMin(int[] arr, int size) {
        if (size == 1) {
            return arr[0];
        }

        return Math.min(arr[size - 1], findMin(arr, size - 1));
    }
}