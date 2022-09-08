public class SumofDigits {
    public static int sum(int num) {
        if (num == 0)
            return 0;
        return (num % 10) + sum(num / 10);
    }

    public static void main(String[] args) {
        int n = 1433;
        System.out.println(sum(n));
    }
}
