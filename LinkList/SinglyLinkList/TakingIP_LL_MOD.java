import java.util.Scanner;

public class TakingIP_LL_MOD {
    
    public static Node<Integer>takeip(){
        Scanner s=new Scanner(System.in);
        int data=s.nextInt();
        Node<Integer>head=null;
        Node<Integer>tail=null;
        while(data>0){
            Node<Integer>current=new Node<>(data);
            if(head==null)
            {
                head=current;
                tail=current;
            }
            else{
                tail.next=current;
                tail=tail.next;
                
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
