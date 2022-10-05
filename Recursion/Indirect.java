//Calculate factorial using indirect recursion//

import java.util.Scanner;
public class Indirect {
    static int fun1(int n)
    {
        if(n<=1)
        return 1;
        else
        return n*fun2(n-1);
    }
     static int fun2(int n)
    {
        if(n<=1)
        return 1;
        else
        return n*fun1(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.close();
        System.out.println("The factorial of "+a+" is:"+fun1(a));

    }
}
