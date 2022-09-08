import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

public class Reverse {
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

    public static void display(Node<Integer> head) {

        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.printf("END");
        System.out.println();
    }

    public static void displayrev(Node<Integer> head) {
        Node<Integer> temp = head;
        Node<Integer> last = null;
        while (temp != null) {
            last = temp;
            temp = temp.next;
        }
        while (last != null) {
            System.out.print(last.data + "->");
            last = last.prev;
        }
        System.out.println("START");
    }

    public static void main(String[] args) {
        Node<Integer> h1 = takeip();
        Node<Integer> res = null;
        res = h1;
        display(h1);
        System.out.println("After reversal the Linklist becomes");
        displayrev(res);
    }
}
