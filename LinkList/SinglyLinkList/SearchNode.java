import java.util.prefs.NodeChangeEvent;

class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
        this.data = data;
        next = null;
    }
}

public class SearchNode {

    public static Node<Integer> createLIst(){

        Node<Integer> a=new Node(10);
        Node <Integer>b=new Node(40);
        Node <Integer>c=new Node(30);
        Node <Integer>d=new Node(40);
        Node <Integer> e=new Node(50);


        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        return a;
    }


    public static int search(Node head,Integer item,int i)
    {
        if(head==null){
            return -1;
        }

        else if(head.data==item){
            return i;
        }

        else{
            return search(head.next, item, i+1);
        }
        
    }


    public static void main(String[] args) {
        Node head=createLIst();

        int ans=search(head,30 , 0);

        System.out.println(ans);
    }
}
