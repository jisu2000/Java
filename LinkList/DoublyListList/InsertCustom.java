import java.util.Scanner;

class Node<T>{
    T data;
    Node<T> prev;
    Node<T> next;
    
    Node(T data)
    {
        this.data=data;
    }
}
public class InsertCustom {
    public static Node<Integer> input()
    {   
        System.out.println("Enter the Nodes");
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        Node<Integer>head=null;
        Node<Integer>tail=null;
        while(data!=0){
        Node<Integer>input=new Node<>(data);
        if(head==null){
            head=input;
            head.prev=null;
            tail=input;
         }
         else{
            input.prev=tail;
            tail.next=input;
            tail=tail.next;
         }
         data=sc.nextInt();
         
        }
        return head;
    }
    public static int getsize(Node<Integer>head)
    {   int size=0;
        Node<Integer>temp=head;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        return size;
    }

    public static void insert(Node<Integer>node,int index,int data){
        Node<Integer>nw=new Node<>(data);
        Node<Integer>temp=node;
        int i=0;
        int size=getsize(node);
        if(index==0)
        {
            nw.next=node;
            nw.prev=null;
            node.prev=nw;
            
        }
         if(index<size-1){
            temp=node;
            while(i<index-1)
            {
                temp=temp.next;
                i++;
            }
            nw.next=temp.next;
            nw.prev=temp;
            
        }
        if(index==size-1)
        {
            temp=node;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            nw.prev=temp;
            temp.next=nw;
            
        }
        
    }
    public static void display(Node<Integer> head) {

        Node<Integer> temp = head;
        
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.printf("END");
        System.out.println();
    }
    public static void main(String[] args) {
        Node<Integer>head=input();
        display(head);
        
        insert(head, 0, 50);
        display(head);

    }

}
