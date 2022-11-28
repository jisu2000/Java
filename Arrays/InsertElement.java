import java.util.Arrays;
import java.util.Scanner;

class InsertElement{

   
    public static void main(String[] args) {
        
    int arr[]=new int [5];
    arr[0]=1;
    arr[1]=2;
    arr[2]=3;
    arr[3]=4;

    insert(arr, 5, 4, 5, 2);
    System.out.println(Arrays.toString(arr));
        
        
    }

    public static void insert(int arr[],int n,int cap,int x,int pos)
    {

        int index=pos-1;

        if(n==cap){
            return;
        }

        for(int i=n-1;i>=index;i--)
        {
            arr[i+1]=arr[i];
            
        }
        arr[index]=x;
        

    }
}