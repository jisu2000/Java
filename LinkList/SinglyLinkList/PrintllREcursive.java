import java.util.LinkedList;

class Node<T> {

    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        next = null;
    }
}

public class PrintllREcursive {

    static void print(Node head) {

        if (head == null) {
            return;
        }
        System.out.print(head.data+"->");

        print(head.next);
    }


    public static Node<Integer> Createlist() {
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        return n1;
    }


    public static void main(String[] args) {
        Node head=Createlist();

        print(head);
    }
}
