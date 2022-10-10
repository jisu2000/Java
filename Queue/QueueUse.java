public class QueueUse {
    
    public static void main(String[] args) throws QueueFullError, QueueEmptyError {
        Queue_Arr Q=new Queue_Arr(5);
        Q.enqueue(10);
        Q.enqueue(15);
        Q.enqueue(20);
        Q.enqueue(25);
        Q.enqueue(30);

        System.out.println("======================");
        System.out.println("Item   "+ "Size   " +"Removed   ");

        System.out.println("======================");

        while(Q.size()>=0)
        {
           
            System.out.print(" "+Q.peek()+"      ");
            System.out.print(+Q.size()+"     ");
            System.out.print( +Q.dequeue()+"  ");

            System.out.println();
            
        }
      

     



       
    }
}
