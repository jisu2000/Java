public class PresentorNot {
    public static boolean check(int A[],int res,int n)
    {   
        if(A.length==0)
        {
            return false;
        }
        
        if(A[A.length-1]==res)
       {
        return true;
       }

        boolean small=check(A,res,n-1);
        return small;

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        System.out.println(check(arr,2,n));
    }
}
