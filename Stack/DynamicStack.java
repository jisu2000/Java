public class DynamicStack {

    private int data[];
    private int topindex;

    public DynamicStack() {
        data = new int[5];
        topindex = -1;
    }

    public int size() {
        return topindex + 1;
    }

    public boolean isempty() {
        return topindex == -1;
    }

    public void push(int element) {
        if (topindex == data.length - 1) {
            modify();
        }

        data[++topindex] = element;
    }

    private void modify() {

        int temp[] = data;
        data = new int[temp.length * 2];

        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }

    }

    public int top() {
        if (isempty()) {
            System.out.println("The Array is Empty");
        }
        return data[topindex];
    }

    public int pop() {
        int temp = data[topindex];
        topindex--;
        return temp;
    }

}
