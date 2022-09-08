public class Link2node {
    public static void main(String[] args) {
        Node<Integer> Node1 = new Node(10);
        Node<Integer> Node2 = new Node(20);
        Node1.next = Node2;

        System.out.println(Node1.next);
        System.out.println(Node2);
       
        
    }
}