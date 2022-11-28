public class QueueStuse {
    public static void main(String[] args) {
        QueueStack<Integer> q=new QueueStack<>();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        

        System.out.println(q.size);

        while(!q.isempty())
        {
            System.out.println(q.dequeue());
        }

        System.out.println(q.size);
    }
    
}
