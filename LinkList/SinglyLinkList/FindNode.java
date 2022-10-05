import java.util.Scanner;
class Node<T> {
    T data;
    Node<Integer> next;
    
    Node(T data) {
        this.data = data;
        next = null;
    }
}
public class FindNode {

    public static Node<Integer> takeip() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Nodes");
        int data = s.nextInt();
        Node<Integer>head=null;
        while(data>0)
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
    
    public static int FindIndex(Node<Integer>head,int data){
        
        int i=0;
        int index=-1;
        Node<Integer>temp=head;
        while(temp!=null){
            if(temp.data==data){
                index=i;
            }
            temp=temp.next;
            i++;
        }
        return index;

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
        System.out.println("The node is ");
        Print(head);
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number You want to find");
        int ind=sc.nextInt();
        int res=FindIndex(head,ind);
        if(res==-1)
        {
            System.out.println(ind+ " not found");
        }
        else{
        System.out.println(ind+" Found in "+res);
        }
    }
}
