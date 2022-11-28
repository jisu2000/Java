import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ReverseFirstK {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of the Queue");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            int el = sc.nextInt();
            q.add(el);
            list.add(el);

        }

        System.out.println("The List You have Entered is:");
        System.out.println(list);

        System.out.println("Enter the Place upto You want to reverse");
        int k = sc.nextInt();

        reverse(q, k);

        while (!q.isEmpty()) {
            list2.add(q.peek());
            q.poll();
        }

        System.out.println("The Queue after  reversal of first " + k + " elements the Queue will become");

        System.out.println(list2);

    }

    public static void reverse(Queue q, int k) {
        int arr[] = new int[q.size()];
        int j = 0;
        while (!q.isEmpty()) {
            arr[j] = (int) q.peek();
            j++;
            q.poll();

        }

        for (int i = 0; i < k / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[k - 1 - i];
            arr[k - 1 - i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }
    }

}
