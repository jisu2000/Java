import java.util.*;
public class IthNode {
    
    public static Node<Integer>CreateList(){
        Node<Integer> n1=new Node<>(10);
        Node<Integer> n2=new Node<>(20);
        Node<Integer> n3=new Node<>(30);
        Node<Integer> n4=new Node<>(40);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        return n1;
    }
   
    public static void print(Node<Integer>head)
    {
        Node<Integer>temp=head;
        
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void ith(Node<Integer>head,int i)
    {
        Node<Integer>temp=head;
        int c=0;
        while(temp!=null && i>c){
            temp=temp.next;
            c++;
        }
        
        System.out.println(temp.data);
    }
    
    public static void main(String[] args) {

        Node<Integer>head=CreateList();
        System.out.println("The Linklist is");
        print(head);
        System.out.println();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Index of the element");
        int i=s.nextInt();
        System.out.print("The "+i+" th element is ");
        ith(head,i);
        
    }

   
}
