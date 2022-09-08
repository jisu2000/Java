import java.util.Scanner;
public class Fibo{
    public static void main(String[] args) {
        System.out.println("Enter the order");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(x+" th term is "+fib(x));
        
    }
    static int fib(int n)
    {
        if(n<2){
        return n;
        }
        return fib(n-1)+fib(n-2);
        
    }
}