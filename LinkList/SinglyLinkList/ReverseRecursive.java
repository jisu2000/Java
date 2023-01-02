
import java.util.Scanner;

public class ReverseRecursive {

    public static void Reverse(Node<Integer> head) {
        if (head == null) {

            return;
        }

        Reverse(head.next);
        System.out.print(head.data + " ");

    }

    public static Node<Integer> takeip(int size) {
        Scanner s = new Scanner(System.in);
        int i = 0;
        Node<Integer> head = null;
        while (i < size) {
            int data = s.nextInt();
            Node<Integer> create = new Node<>(data);
            if (head == null) {
                head = create;
            } else {
                Node<Integer> tail = head;
                while (tail.next != null) {
                    tail = tail.next;
                }
                tail.next = create;
            }
            i++;
        }
        return head;
    }

    public static void Print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of The LinkList");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter " + size + " items");
        Node<Integer> head = takeip(size);
        System.out.println("The LinkList is->");
        Print(head);
        System.out.println();
        System.out.println("Printing The LinkList is Reverse order->");
        Reverse(head);

    }
}
