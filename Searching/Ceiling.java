import java.util.Arrays;
import java.util.Scanner;

//ceiling element is the element which is == target or smallest greater than the target element//

public class Ceiling {

    public static int Search(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            else if (target < arr[mid]) {
                end = mid - 1;
            }

            else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {

        System.out.println("Enter the length of the Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Array You have Entered is");
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the Element you want to find");
        int target = sc.nextInt();

        int ans = Search(arr, target);

        System.out.println(target + " should be in " + ans + " position");

    }

}
