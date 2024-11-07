import java.util.*;

public class MyLinkedList<E extends Comparable<E>> implements ListInterface<E> {
    private Node<E> head;
    private int numNode;

    public MyLinkedList() {
        this.head = null;
        this.numNode = 0;
    }

    public Node<E> getHead() {
        return head;
    }

    public void addSortedList(E item) {
        Node<E> newNode = new Node<>(item);

        if (head == null || head.getData().compareTo(item) > 0) {
            newNode.setNext(head);
            head = newNode;
            numNode++;
            return;
        }

        Node<E> current = head;
        while (current.getNext() != null && current.getNext().getData().compareTo(item) <= 0) {
            current = current.getNext();
        }

        newNode.setNext(current.getNext());
        current.setNext(newNode);
        numNode++;
    }

    public void print() throws NoSuchElementException {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        } else {
            Node<E> temp = head;
            while (temp != null) {
                System.out.print(temp.getData() + "->");
                temp = temp.getNext();
            }
            System.out.print("null");
            System.out.println();
        }
    }
}
