import java.util.Scanner;
public class Power {
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The base");
        int b=sc.nextInt();
        System.out.println("Enter the Power");
        int p=sc.nextInt();
        System.out.println( p+" to the power "+b+" is "+power(b,p));
    }
    public static int power(int x,int n)
    {
        if(n==1)
        {
            return x;
        }
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
}
