public class ListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addSortedList(5);
        list.addSortedList(1);
        list.addSortedList(10);
        list.addSortedList(7);
        list.addSortedList(3);

        list.print();

        int count = ListOperations.countEvenNumbers(list);
        int sum = ListOperations.sumAllNumbers(list);

        System.out.println("Total even numbers: " + count);
        System.out.println("Total sum: " + sum);
    }
}
