import java.util.Arrays;

public class Rearange {
    

        static void rearrangeArray(int[] arr, int n) {
            // code here
            Arrays.sort(arr);
            int arr1[]=new int[n];
            int s=0;
            int e=n-1;
            
            for(int i=0;i<n;i++)
            {
                if(i%2!=0)
                {
                    arr1[i]=arr[s];
                    s++;
                }
                if(i%2==0)
                {
                    arr1[i]=arr[e];
                    e--;
                }
            }
            for(int i=0;i<n;i++)
            {
                arr[i]=arr1[i];
            }
            
            
            
           
        }

        public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6,7,8,9};
            
            rearrangeArray(arr,9);

            System.out.println(Arrays.toString(arr));
        }

        
    }

