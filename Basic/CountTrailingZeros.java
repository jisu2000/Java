import java.util.Scanner;

public class CountTrailingZeros {
    static int CountZeros(int n)
    {
        int res=0;

        for(int i=5;i<=n;i*=5)
        {
            res+=n/i;
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println("Enter The Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int ans=CountZeros(n);

        System.out.println("Factorial of "+n+" has "+ans+" trailing Zero");
    }
}
