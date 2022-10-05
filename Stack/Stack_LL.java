class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        this.next = null;
    }

}

public class Stack_LL<T> {

    private Node<T> head;

    private int size;

    public Stack_LL() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isempty() {
        return size == 0;

    }

    public void push(T elem) {

        Node<T> newNode = new Node<>(elem);
        newNode.next = head;
        head = newNode;
        size++;

    }

    public T top() {
        if (head == null) {
            System.out.println("Stack is empty");
        }
        return head.data;

    }

    public T pop() {
        if (head == null) {
            System.out.println("Stack is empty");
        }

        T temp = head.data;
        head = head.next;
        size--;
        return temp;

    }

}
