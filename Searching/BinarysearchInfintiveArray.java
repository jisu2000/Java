
import java.util.Arrays;
import java.util.Scanner;

class BinarysearchInfiniteArray {

    static int BinarySrach(int arr[], int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;

            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int ans(int arr[], int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;
            end = end+ ((end - start) + 1) * 2;
            start = temp;

        }

        return BinarySrach(arr, target, start, end);

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

        int a = ans(arr, target);

        System.out.println(target + " should be in " + a + " position");
    }

}
