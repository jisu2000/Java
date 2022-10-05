import java.util.Scanner;

public class Factorial {

    static int fact(int x) {
        int f = 1;
        if (x == 1) {
            return x;
        }

        return x * fact(x - 1);

    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        System.out.println("The factorial is: " + fact(a));
    }
}
