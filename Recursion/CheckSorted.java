import java.util.*;
public class CheckSorted{


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length of the Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elemets of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("The Array is ");
        System.out.println(Arrays.toString(arr));
        if(sorted(arr, 0))
        {
            System.out.println("The Array is Sorted");
        }
        else{
            System.out.println("The Array is Unsorted");
        }
        
    }

    static boolean sorted(int[]arr,int index)
    {
        if(index==arr.length-1)
        {
            return true;
        }
        return (arr[index]<=arr[index+1] && sorted(arr,index+1));
    }
}