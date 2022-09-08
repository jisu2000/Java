import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort {
  
    static void Sort(int arr[])
    {
      int n=arr.length;
        int temp;
        int flag=0;
        
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0)
            break;  
        }
       }
      public static void main(String[] args) {
          System.out.println("Enter the Number of the Elements:");
          Scanner sc=new Scanner(System.in);
          int num=sc.nextInt();
          int A[]=new int [num];
          System.out.println("Enter Array Elements:");
          for(int i=0;i<num;i++)
          {
             A[i]=sc.nextInt();
          }
          sc.close();
          Sort(A);
          System.out.println("The Array after sort:");
          System.out.println(Arrays.toString(A));
        }   
}
