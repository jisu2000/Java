public class SumofArray {

    static int findsum(int A[],int N)
    {
        if(N==1)
        {
            return A[0];
        }
        
        return findsum(A,N-1)+A[(N-1)];
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int n=arr.length;
        System.out.println(findsum(arr,n));
    }
    
}
