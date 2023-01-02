import java.util.Scanner;

public class InsertNodeRecursion {

    public static Node<Integer> insert(Node<Integer> head, int elem, int pos) {
        if (head == null && pos < 0) {
            return head;
        }
        if (pos == 0) {
            Node<Integer> newNode = new Node<>(elem);
            newNode.next = head;
            head = newNode;
            return head;
        } else {
            Node<Integer> smallhead = insert(head.next, elem, pos - 1);
            head.next = smallhead;
            return head;
        }
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
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        System.out.println("Enter The Size of the Node:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        System.out.println("Enter " + size + " items");
        Node<Integer> head = takeip(size);
        System.out.println("The Initial LinkedList is-->> :");
        Print(head);
        System.out.println();
        System.out.println("Enter The Element You want to insert");
        int el = sc.nextInt();
        System.out.println("Enter The Position You want to Insert");
        int pos = sc.nextInt();
        System.out.println();
        System.out.println("The LinkedList after Modificaton-->> :");
        Print(insert(head, el, pos));
    }
}
