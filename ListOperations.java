public class ListOperations {
    public static int countEvenNumbers(MyLinkedList<Integer> list) {
        Node<Integer> current = list.getHead();
        int count = 0;

        while (current != null) {
            if (current.getData() % 2 == 0) {
                count++;
            }
            current = current.getNext();
        }
        return count;
    }

    public static int sumAllNumbers(MyLinkedList<Integer> list) {
        Node<Integer> current = list.getHead();
        int sum = 0;

        while (current != null) {
            sum += current.getData();
            current = current.getNext();
        }
        return sum;
    }
}
