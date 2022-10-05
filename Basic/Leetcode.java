public class Leetcode{

    public static void main(String[] args) {
        int max=0;
        
        int[]arr={10,2,1,4,5};

        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}