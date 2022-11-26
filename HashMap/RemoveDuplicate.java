import java.util.ArrayList;
import java.util.HashMap;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,3,2,5};
        ArrayList<Integer> list=new ArrayList<>();
        list=remove(arr);

        System.out.println(list);
    }

    public static ArrayList<Integer> remove(int arr[]){

        ArrayList<Integer> output=new ArrayList<>();

        HashMap<Integer,Boolean> map=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {

            if(map.containsKey(arr[i]))
            {
                continue;
            }
            else{
                output.add(arr[i]);
                map.put(arr[i], true);
            }
        }
        return output;

    }
}
