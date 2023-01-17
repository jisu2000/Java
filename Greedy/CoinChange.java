import java.util.ArrayList;
import java.util.Scanner;

public class CoinChange {

    public static void main(String[] args) {
        int coin[] = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount");
        int x = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        list = Coinchange(coin, x);

        System.out.println("The minimum coin required is :" + list.size());

        System.out.println("The coins: " + list);

    }

    public static ArrayList<Integer> Coinchange(int arr[], int x) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (x >= arr[i]) {
                list.add(arr[i]);
                x = x - arr[i];
            }
        }
        return list;

    }

}