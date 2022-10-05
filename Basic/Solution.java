public class Solution {
    
        int binarysearch(int arr[], int n, int k) {
            
            int start=0;
            int end=n-1;
             
            while(arr[start]<=arr[end])
            {  
                int mid=start-((start+end)/2);
               
                if(k>arr[mid])
                {
                start=mid+1;
                }
                 else if(k<arr[mid])
                {
                end=mid-1; 
                }
                 else 
                {
                    return mid;
                }
            }   
            return -1;
        }
        public static void main(String[] args) {
            int array[]={1,2,3,4,5};
            System.out.println(binarysearch(array[],5,5));
        }
    }

