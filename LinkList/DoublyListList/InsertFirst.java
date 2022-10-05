import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

public class InsertFirst {
    public static Node<Integer> takeip() {
        System.out.println("Enter the Nodes");
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data > 0) {
            Node<Integer> current = new Node<>(data);
            if (head == null) {
                head = current;
                head.prev = null;
                tail = current;
            } else {
                current.prev = tail;
                tail.next = current;
                tail = tail.next;

            }
            data = s.nextInt();
        }
        return head;
    }

    public static Node<Integer> insertfirst(Node<Integer> head, int data) {
        Node<Integer> node = new Node<>(data);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        return head;
    }

    public static void display(Node<Integer> head) {

        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.printf("END");
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> head = takeip();
        System.out.println("The Doubly LinkList is");
        display(head);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value You want to insert at first");
        int f = s.nextInt();
        Node<Integer> temp = null;
        temp = insertfirst(head, f);
        System.out.println("After inserting the LinkList is");
        display(temp);
    }
}
