public class ProductofDigits {
    public static void main(String[] args) {
        int ans = getproduct(507);
        System.out.println(ans);
    }

    static int getproduct(int num) {

        if (num % 10 == num) {
            return num;
        }

        return (num % 10) * getproduct(num / 10);
    }
}
