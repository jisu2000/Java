import java.util.Scanner;

class Node<T> {
    T data;
    Node<Integer> next;

    Node(T data) {
        this.data = data;
        next = null;
    }
}

public class InsertNode {
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

    public static Node<Integer> Insert(Node<Integer> head, int pos, int val) {
        Node<Integer> newNode = new Node<>(val);
        int i = 0;
        if (pos == 0) {
            newNode.next = head;
            head = newNode;
            return newNode;
        }
        Node<Integer> temp = head;
        while (i < pos - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeip();
        Scanner s = new Scanner(System.in);
        System.out.println("The previous Node was");
        print(head);
        System.out.println();
        System.out.println("Enter the Value You want to insert");
        int val = s.nextInt();
        System.out.println("Enter the position");
        int i = s.nextInt();
        System.out.println("The Updated node is");
        Node<Integer> update = null;
        update = Insert(head, i, val);
        print(update);

    }

}
