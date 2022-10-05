import java.util.Scanner;
public class Multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number");
        int a=sc.nextInt();
        System.out.println("Enter the Second number");
        int b=sc.nextInt();
        System.out.println("The multiplication of "+a+" and "+b+" is "+mul(a,b));
        
    }
    public static int mul(int a, int b)
    
    {
        if(a==0|| b==0)
        {
            return 0;
        }
        return a+mul(a,b-1);
    }
}
