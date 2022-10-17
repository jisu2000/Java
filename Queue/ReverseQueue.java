import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();

        System.out.println("Enter the Size of the Queue");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        System.out.println("Enter " + n + " element");
        for (int i = 0; i < n; i++) {
            int el = sc.nextInt();
            q.add(el);

            list.add(el);

        }
        System.out.println("The Queue You have made is");
        System.out.println(list);

        reverse(q);

        while (!q.isEmpty()) {
            list2.add(q.peek());
            q.poll();

        }

        System.out.println("After Reverse the Queue is");
        System.out.println(list2);

    }

    public static void reverse(Queue q) {

        Stack<Integer> stack = new Stack<>();

        while (!q.isEmpty()) {
            stack.push((Integer) q.peek());
            q.remove();

        }

        while (!stack.isEmpty()) {
            int el = stack.peek();
            q.add(el);
            stack.pop();

        }
    }
}
