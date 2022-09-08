import java.util.Arrays;

public class Test1 {
    public static int[] plusOne(int[] digits) {
        
        int num=0;
        int num1=0;
        int temp=0;
        int temp1=0;
        
        
        for(int i=0;i<digits.length;i++)
        {
            num=num*10+digits[i];

        }
        num1=num+1;
        int rev=0;
        int j=0;
        int k=0;
        int [] arr1=new int [digits.length];
        int [] arr2=new int [digits.length+1];
        while(num1!=0)
        {
            arr1[j]=(num1%10);
            num1=(num1/10);
            j=j+1;
        }
        for(int i=0;i<(arr1.length)/2;i++)
        {
           temp=arr1[i];
           arr1[i]=arr1[arr1.length-1-i];
           arr1[arr1.length-1-i]=temp;


        }
        if(num1%10!=9){
        return arr1;
        }
          while(num1!=0)
        {
            arr2[k]=num1%10;
            num1=(num1/10);
            k=k+1;
        }
        for(int i=0;i<(arr2.length)/2;i++)
        {
           temp=arr2[i];
           arr2[i]=arr1[arr2.length-1-i];
           arr2[arr2.length-1-i]=temp;


        }
        return arr2;
     
       
    }
    public static void main(String[] args) {
        int []arr={1,2,3};
        
    }
}