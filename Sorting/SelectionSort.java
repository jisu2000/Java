import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    static void Sort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int last = arr.length - 1 - i;
            int maxInd = getmax(arr, 0, last);
            swap(arr, maxInd, last);
        }
    }

    static int getmax(int arr[], int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
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
