public class Binarysearch {

    static int search(int arr[], int target, int start, int end) {
        
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target < arr[mid]) {
            return search(arr, target, start, mid - 1);
        }
       
            return search(arr, target, mid + 1, end);
        
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6};
        int target=5;
        int start=0;
        int end=array.length-1;
        System.out.println(search(array,target,start,end));
    }


}
