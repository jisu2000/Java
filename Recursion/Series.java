public class Series {
    public static void main(String[] args) {
        int x = 10;
        print(x);
    }

    public static void print(int n) {
        if (n == 0) {
            return;
        }
        
        print(n-1);
        System.out.print(n+" ");
        
    }

}
