import java.util.Arrays;

public class DeleteArray{
    /**
     * @param args
     */
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        
        int i=0;
        int j=0;
        while(i<arr.length){
            if(arr[i]!=2)
            {
                arr[j]=arr[i];
                System.out.print((arr[j])+" ");
            }
            i++;
            j++;
        }
    }
}

        
         
        
       
    
