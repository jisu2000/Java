import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int n=sc.nextInt();

        if(isodd(n)){
            System.out.println(n+" is a Odd Number");
        }
        else{
            System.out.println(n+" is a Even Number");
        }
    }

    public static boolean isodd(int n)
    {
        return (n & 1)==1;
    }
}