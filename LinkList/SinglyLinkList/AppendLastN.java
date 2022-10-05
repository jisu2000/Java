import java.util.Scanner;

public class AppendLastN {
    
    public static Node<Integer> takeip() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the node");
        int data = s.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data > 0) {
            Node<Integer> newNode = new Node<>(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
            data = s.nextInt();
        }
        return head;
    }

    public static Node<Integer>Append(Node<Integer>head,int N){
        Node<Integer>temp=head;
        int length=0;
        while(temp!=null)
        {
        length++;
        temp=temp.next;          //Finding the length of the Main list//
        }
        int res=length-N;

        int count=0;
        
        Node<Integer>last2=head;
        while(count<res-1)
        {
            
            last2=last2.next;
            count++;
        }
        
        Node<Integer>head2=last2.next; 
        Node<Integer>temp2=head2;
        int i=0;
        while(i<N-1)
        {
            temp2=temp2.next;
            i++;
        }
        temp2.next=head;
        head=head2;
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
        Node<Integer>head=takeip();
        Print(head);
        System.out.println();
        Node<Integer>update=null;
        update=Append(head, 2);
        Print(update);
        
    }


}
