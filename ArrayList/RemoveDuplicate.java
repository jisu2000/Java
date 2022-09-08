import java.util.ArrayList;
import java.util.Arrays;



public class RemoveDuplicate {
    
 
public static ArrayList<Integer> removeduplicate(int arr[])

{
    ArrayList<Integer> result=new ArrayList<>();
    result.add(arr[0]);
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i]!=arr[i-1])
        result.add(arr[i]);
    }
    return result;

}
public static void main(String[] args) {
    int arr[]={1,2,3,3,3,4,3,5,6,1};
    Arrays.sort(arr);
    ArrayList<Integer> last=removeduplicate(arr);
    System.out.println(last);

    
}

}
