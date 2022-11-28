import java.util.Arrays;

public class ReverseK {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(arr, 1);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int arr[],int k){

        for(int i=0;i<k/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[k-1-i];
            arr[k-1-i]=temp;
        }
    }
}
