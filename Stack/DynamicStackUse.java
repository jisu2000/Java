public class DynamicStackUse {
    
    public static void main(String[] args) {
        DynamicStack s=new DynamicStack();
        int arr[]={1,2,3,4,5,6,7,8,9,10};

        for(int i=0;i<arr.length;i++)
        {
            s.push(arr[i]);
        }

        System.out.println(s.size());

        for(int i=0;i<arr.length;i++)
        {
            System.out.println((s.pop()));
        }
    }
}
