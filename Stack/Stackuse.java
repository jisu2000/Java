public class Stackuse {
    public static void main(String[] args) {
        Stack s=new Stack(5);

        Stack.push(10);
        Stack.push(15);
        Stack.push(20); 
        Stack.push(25);
        Stack.push(35);
        
        

        System.out.println(Stack.pop());
        System.out.println(Stack.pop());
        System.out.println(Stack.pop());
        System.out.println(Stack.pop());
        System.out.println(Stack.pop());
        



    }
}
