public class Pattern14 {

    //              1
    //            2 1 2
    //          3 2 1 2 3       
    //        4 3 2 1 2 3 4     
    //      5 4 3 2 1 2 3 4 5   
    //    6 5 4 3 2 1 2 3 4 5 6 
    //      5 4 3 2 1 2 3 4 5   
    //        4 3 2 1 2 3 4     
    //          3 2 1 2 3       
    //            2 1 2
    //              1

    static void print(int n) {
        for (int row = 1; row <= (2 * n - 1); row++) {
            int newcolum = 1;
            if (row <= n) {
                newcolum = row;
            } else {
                newcolum = ((2 * n) - row);
            }

            int space = n - newcolum;
            for (int i = 1; i <= space; i++) {
                System.out.print("  ");
            }
            for (int col = newcolum; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int col = 2; col <= newcolum; col++) {
                System.out.print(col + " ");
            }

            System.out.println();

        }
    }
        public static void main(String[] args) {
            print(6);
        }
    
}
