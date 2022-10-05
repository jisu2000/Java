
public class Pattern2 {
    //  * * * * * *
    //  * * * * *
    //  * * * *
    //  * * *
    //  * *
    //  *

    static void print(int n) {

        for (int row = n; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(6);
    }
}
