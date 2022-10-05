public class Stack_ARR_use {
    public static void main(String[] args) {
        StackUsingArray s=new StackUsingArray();

        s.push(10);
        s.push(15);
        s.push(30);
        s.push(40);
        System.out.println(s.size());
        
        System.out.println(s.pop());
        System.out.println(s.size());
    }
}
