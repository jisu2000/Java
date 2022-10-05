public class CLL {
    public Node head;
    public Node tail;
    

    public CLL()
    {
        this.head=null;
        this.tail=null;
    }

    public void insert(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void Display()
    {
        Node node=head;
        if(head!=null)
       do{
            System.out.print(node.val+"->");
            node=node.next;
        }
       
        while(node!=head);
        System.out.println("HEAD");
    }
   
    public void delete(int val){
        Node node=head;
        if(node==null){
            return ;

        }
        if(node.val==val)
        {
            head=head.next;
            tail.next=head;
            return;

        }
        do{
            Node n=node.next;
            if(n.val==val)
            {
                node.next=n.next;
                break;
            }
            node=node.next;
           
        }
        while(node!=head);


    }

    public class Node{
        int val;
        Node next;

        public Node(int val)
        {
            this.val=val;
        }

}
    public static void main(String[] args) {
        CLL list=new CLL();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.Display();
        list.delete(30);
        list.Display();
    }
    
    
}
