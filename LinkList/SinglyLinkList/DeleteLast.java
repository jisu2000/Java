import java.util.Scanner;
class Node<T>{
    T data;
    Node next;

    Node(T data){
        this.data=data;
        this.next=null;
    }
}


public class DeleteLast {
    
     public static Node<Integer>takeip(){

        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Node<Integer>head=null;
        while(data!=-1){

            Node<Integer>create=new Node(data);

            if(head==null){
                head=create;
            }

            else{
                Node<Integer>tail=head;
                while(tail.next!=null){
                    tail=tail.next;
                }
                tail.next=create;
            }
            data=sc.nextInt();
        }
        return head;
    }

    public static Node<Integer> DeleteNode(Node<Integer> head)
    {
        if(head==null){
            return null;
        }

        else{
            Node<Integer> tail=head;
            while(tail.next.next!=null)
            {
                tail=tail.next;
            }

            tail.next=null;
        }

        return head;
    }
    public static void Print(Node<Integer> head){
        Node<Integer> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }



    public static void main(String[] args) {
        Node<Integer> head=takeip();
        Print(head);
        System.out.println();
        Node<Integer> up=DeleteNode(head);
        
        Print(up);

    }
}
