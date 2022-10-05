import java.util.Arrays;
import java.util.Scanner;

public class First_Last {
    public static int[] searchRange(int[] nums, int target) {
        int ans[] = { -1, -1 };

        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;

        return ans;

    }

    static int search(int[] nums, int target, boolean findInd) {
        int start = 0;
        int ans = -1;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {

                ans = mid;
                if (findInd == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println("Enter The Length of The Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter " + n + " items");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The Array is");
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter The Element ");
        int target = sc.nextInt();

        int arr2[] = searchRange(arr, target);

        System.out.print("The First and the last index of " + target + " is " + Arrays.toString(arr2));
    }
}
