import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {

        if (change(digits)) {
            int arr2[] = new int[digits.length + 1];
            arr2[0] = 1;
            for (int j = 1; j < digits.length; j++) {
                arr2[j] = 0;
            }
            digits = arr2;
            return digits;
        }

        int carry = 1;
        int num = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            num = digits[i] + carry;
            digits[i] = (digits[i] + carry) % 10;
            carry = (num) / 10;
        }

        return digits;

    }

    static boolean change(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 9) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 9, 9 };
        int[] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }
}