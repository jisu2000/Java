
public class StackUsingLL {
    public static void main(String[] args) {
        Stack_LL<Integer> stack=new Stack_LL<>();

        int arr[]={1,2,3,4,5};

        for(int i=0;i<arr.length;i++)
        {
            stack.push(arr[i]);
        }

        System.out.println("The size is "+stack.size());

        while(!stack.isempty())
        {
            System.out.println(stack.pop()+" : poped");
            System.out.println(stack.top()+ " : Top");
            System.out.println("The Size is now "+ stack.size());
        }
     
    }
}
