public class Rev {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int temp;
        for(int i=0;i<6/2;i++)
        {
            
           temp=arr[i];
           arr[i]=arr[5-i];
           arr[5-i]=temp;

        }
         for(int i=0;i<6;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
