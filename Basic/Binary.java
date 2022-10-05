public class Binary {
    public static void main(String[] args) {
        int num=10;
        int arr[]=new int[8];
        
        int temp;
       int i=0;
           while(num!=0)
        { 
            if(num%2==0) 
            {
                arr[i]=0;
            } 
            else
            {
                arr[i]=1;
            } 
        
            num=num/2;
            i++;
    }
   for(int k=0;k<i/2;k++)
    {
        temp=arr[k];
        arr[k]=arr[(i-1)-k];
        arr[(i-1)-k]=temp;
    
    }  
    for(int j=0;j<i;j++)
    {
        System.out.print(arr[j]);
    }
    
    }
    
}
