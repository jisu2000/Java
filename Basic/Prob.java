1import java.util.Scanner;
import java.lang.Math;

public class Prob {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rem1,pow,rem;
        int rev=0;
        int ans=0;
        int count=0;
        int count1=0;
        while(a!=0)
        {
             rem=a%10;
            if(rem==5)
            {
                rem=0;
            }
            
            rev=rev*10+rem;
            a=a/10;
            count=count+1;
           
        }
           int num=rev;
           while(num!=0)
        {
            rem1=num%10;
            ans=ans*10+rem1;
            num=num/10;
            count1=count1+1;
       }
        if(count>count1)
        {
            
            pow=(int) Math.pow(10,count-count1);
            
            System.out.println(ans*pow);
            
        }
        

        else{
            System.out.println(ans);

        }
        
    }
}
