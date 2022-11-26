import java.util.*;

public class ThirdMax {
    public static int thirdMax(int[] nums) {

        if (nums.length <= 3) {
            return nums[nums.length - 1];
        }
        ArrayList<Integer> list = new ArrayList<>();
        list = remove(nums);
        Collections.sort(list);
        if (list.size() < 3) {
            return list.get(list.size() - 1);
        }
        return list.get(list.size() - 3);

    }

    public static ArrayList<Integer> remove(int arr[]) {

        ArrayList<Integer> output = new ArrayList<>();

        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                continue;
            } else {
                output.add(arr[i]);
                map.put(arr[i], true);
            }
        }
        return output;

    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2 };

        System.out.println(thirdMax(arr));
    }
}
