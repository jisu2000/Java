import java.util.Scanner;

class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;

    Node(T data) {
        this.data = data;
    }
}

public class InsertLast {

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

    public static Node<Integer> insertLast(Node<Integer> node, int data) {

        Node<Integer> nw = new Node<>(data);
        Node<Integer> temp = node;
        if(node==null){
            node=nw;
            return node;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        nw.prev = temp;
        temp.next = nw;
        return node;
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
        Scanner sc = new Scanner(System.in);
        Node<Integer> h1 = takeip();
        display(h1);
        Node<Integer> h2 = null;
        System.out.println("Enter the Node");
        int d = sc.nextInt();
        h2 = insertLast(h1, d);
        System.out.println("After inserting the LinkList becomes");
        display(h2);
    }
}
