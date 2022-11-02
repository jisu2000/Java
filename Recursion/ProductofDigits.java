public class ProductofDigits {
    public static void main(String[] args) {
        int ans = getproduct(57);
        System.out.println(ans);
    }

    static int getproduct(int num) {

        if (num /10 == 0) {
            return num;
        }

        return (num % 10) * getproduct(num / 10);
    }
}
