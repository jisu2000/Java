import java.util.Scanner;
public class TwoD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int n=sc.nextInt();
        System.out.println("Enter the number of Column");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<m;col++)
            
            arr[row][col]=sc.nextInt();

            
            
        }
        for(int row=0;row<n;row++)
        {
            for(int col=0;col<m;col++)
            {
            System.out.print(arr[row][col]);
            System.out.print(" ");

            }
            System.out.println("\n");
            
            
        }
    }
    
}
