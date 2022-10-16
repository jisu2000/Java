import java.util.Stack;

public class QueueStack<T> {
    
    Stack<T> s1;
    Stack<T> s2;
    int size=0;

    public QueueStack(){
        s1=new Stack<>();
        s2=new Stack<>();
    }

    public boolean isempty(){
        return s1.isEmpty();
    }

    public void enqueue(T item){

        s1.push(item);
        size++;
    }
    public int size(){
        return size;
    }

    public T dequeue(){

        if(size==0){
            System.out.println("Queue is Empty");
        }
        while(s1.size()!=1){
            s2.push(s1.peek());
            s1.pop();
        }
        T temp=s1.peek();
        s1.pop();
        size--;

        while(!s2.isEmpty())
        {
            s1.push(s2.peek());
            s2.pop();
        }

        return temp;
        

    }


}
