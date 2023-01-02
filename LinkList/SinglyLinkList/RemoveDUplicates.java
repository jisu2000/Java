import java.util.Scanner;

 class RemoveDUplicates{

    public static Node<Integer> takeip(int size) {
        Scanner s = new Scanner(System.in);
        int i=0;
        Node<Integer>head=null;
        while(i<size)
        {
            int data=s.nextInt();
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
            i++;
        }
        return head;
    }

    public static void Print(Node<Integer> head) {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }
    public static Node<Integer> deleteDuplicates(Node<Integer> head) {

        if(head==null){
            return null;
        }
        Node<Integer> temp=head;
        
        while(temp.next!=null){
            Node<Integer> comp=temp.next;

            if(temp.data==comp.data){
                temp.next=temp.next.next;
            }
            else{
            temp=temp.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        System.out.println("Enter the LinkList Size");
       
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("Enter "+size+" Elements in Sorted order");
        Node<Integer> head=takeip(size);

        System.out.println("The Link List is: ");
        Print(head);

        System.out.println();

        System.out.println("After removing all The Dupicates The LinkList will Be:");

        Node<Integer> res=null;
        res=deleteDuplicates(head);

        Print(res);


    }




}