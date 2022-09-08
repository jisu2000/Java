public class Pattern6 {
    //   1 2 3 4 5 6
    //   1 2 3 4 5
    //   1 2 3 4
    //   1 2 3
    //   1 2
    //   1

    static void print(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(6);
    }
}
