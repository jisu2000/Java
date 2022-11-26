import java.util.Arrays;

public class MaxChar {

    public static char getMaxOccuringChar(String line) {

        int c = 0;

        char arr[] = line.toCharArray();
        char res = 'z';
        int max = 0;

        if (arr.length == 1) {
            return arr[arr.length - 1];
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                c++;

            }

            else if (arr[i] != arr[i + 1]) {
                c = 0;

            }
            if (c >= max) {
                max = c;
                res = arr[i];
            }
            if (c >= max && c == 0) {
                max = c;
                res = arr[i + 1];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String str = "subhadeep";
        System.out.println(getMaxOccuringChar(str));
    }
}
