import java.util.*;
public class LinearSearch {
   
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length of the Array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elemets of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("The Array is ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the Element You want to Search");
        int res=sc.nextInt();
       
       ArrayList<Integer> l1=new ArrayList<>();
        l1=search(arr, 0, res, l1);
        if(l1.isEmpty())
        {
            System.out.println(res+" Not found!!");
        }
        
        if(!l1.isEmpty())
        
      
            System.out.println(res+" is in "+search(arr, 0, res, new ArrayList<>()));
        
        
    }
    
    
    static ArrayList search(int arr[],int index,int res,ArrayList<Integer>list)
    {
        
        if(index==arr.length)
        {
            return list;
        }

        if(arr[index]==res)
        {
            list.add(index);
        }
    return search(arr,index+1,res,list);
    }
}
