import java.util.Scanner;
import java.util.*;

public class TakingInputLL {
    public static Node<Integer> takeip() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer>head=null;
        while(data!=-1)
        {
            Node<Integer>create=new Node<>(data);
            if(head==null)
            {
                head=create;
            }
            else{
                Node<Integer>tail=head;
                while(tail.next!=null)
                {
                    tail=tail.next;
                }
                tail.next=create;
            }
            data=s.nextInt();
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
        Node<Integer> head = takeip();
        Print(head);

    }
}
