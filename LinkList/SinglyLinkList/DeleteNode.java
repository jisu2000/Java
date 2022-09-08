import java.util.Scanner;

class Node<T> {
    T data;
    Node<Integer> next;

    Node(T data) {
        this.data = data;
        next = null;
    }
}

public class DeleteNode {

    public static Node<Integer> remove(Node<Integer> head, int pos) {
        if (head == null) {
            return head;
        }
        if (pos == 0) {
            return head.next;
        }
        int count = 0;
        Node<Integer> temp = head;
        while (temp != null && count < (pos - 1)) {
            temp = temp.next;
            count++;
        }
        // if (temp == null || temp.next == null) {
        //     return head;
        // }
        temp.next = temp.next.next;
        return head;
    }

    public static Node<Integer> takeip() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node");
        int data = s.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data > 0) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
            data = s.nextInt();
        }
        return head;

    }

    static void print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node<Integer> head = takeip();
        Scanner s = new Scanner(System.in);
        System.out.println("The previous Node was");
        print(head);
        System.out.println();

        System.out.println("Enter the position");
        int i = s.nextInt();
        System.out.println("The Updated node is");
        Node<Integer> update = null;
        update = remove(head, i);

        print(update);

    }

}
