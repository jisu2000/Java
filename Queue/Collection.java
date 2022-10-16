import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Collection{

    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();

        System.out.println("Enter The Queue Size ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter "+size+" elements");
        
        for(int i=0;i<size;i++){
            int el=sc.nextInt();
            q.add(el);
            list.add(el);
        }
        System.out.println("The Queue You have made is");
        System.out.println(list);


        System.out.println("Removing all items from the Queue in First in First out Fashion");

        while(!q.isEmpty())
        {
            System.out.println("Removing "+q.poll());
        }
        


        
    }
}