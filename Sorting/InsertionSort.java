import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    static void Sort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swap(int arr[],int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        System.out.println("Enter The Length of the Array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("Enter "+n+" elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The Array You have Entered is:");
        System.out.println(Arrays.toString(arr));
        System.out.println("The Array after Sorting is:");
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
