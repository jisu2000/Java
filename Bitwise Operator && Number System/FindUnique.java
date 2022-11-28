public class FindUnique {
    public static void main(String[] args) {
        int arr[]={1,2,2,3,3};
        System.out.println(unique(arr));
    }

    public static int unique(int arr[])
    {
        int ans=0;

        for(int i=0;i<arr.length;i++)
        {
            ans=arr[i]^ans;
        }
        return ans;
    }
}
