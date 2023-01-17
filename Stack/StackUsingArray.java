public class StackUsingArray {

    private int data[];
    private int topind;

    public StackUsingArray() {
        data = new int[10];
        topind = -1;
    }

    public int size() {
        return topind + 1;
    }

    public boolean isempty() {
        return (topind == -1);
    }

    public void push(int element) {
        if (topind == data.length - 1) {
            System.out.println("STACK is Full!!");

        } else {
            data[++topind] = element;
        }
    }

    public int pop() {
        if (isempty()) {
            System.out.println("STACK is Empty!!");
        }

        int temp = data[topind];
        topind--;
        return temp;

    }

    public int top() {
        return data[topind];
    }

}
