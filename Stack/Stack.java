public class Stack {

    protected static int[] data;
    private static final int DEFAULT = 10;

    static int ptr = -1;

    public Stack(int size) {
        this.data = new int[size];

    }

    public Stack() {
        this(DEFAULT);
    }

    public static boolean isfull() {
        return ptr == data.length - 1;
    }

    public static boolean isempty() {
        return ptr == -1;
    }

    public static boolean push(int item) {
        
        if (isfull()) {
            System.out.println("The Stack is Full!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public static int pop() {
        if (isempty()) {
            System.out.println("Stack is Empty!!");
        }
        return data[ptr--];
    }

    public int peak() {
        if (isempty()) {
            System.out.println("The Stack is empty");
        }
        return data[ptr];
    }

}