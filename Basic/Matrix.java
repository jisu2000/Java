import java.util.Scanner;
public class Matrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of column");
        int c=sc.nextInt();
        System.out.println("Enter the Number of Rows");
        int r=sc.nextInt();
        int arr1[][]=new int [c][r];
        int arr2[][]=new int [c][r];
        int arr3[][]=new int [c][r];
        
        
        System.out.println("Enter "+c*r+" elements of the matrix 1");
        for(int col=0 ;col<c;col++)
        {
            for(int row=0;row<r;row++)
            {
                arr1[col][row]=sc.nextInt();
            }
        }

        System.out.println("The matrix 1 is :");
        for( int col=0;col<c;col++)
        {
            for(int row=0;row<r;row++)
            {
                System.out.print(arr1[col][row]);
                System.out.print(" ");
            }
            System.out.println("\n");

        }

        System.out.println("Enter "+c*r+" elements of the matrix 2");
        for(int col=0 ;col<c;col++)
        {
            for(int row=0;row<r;row++)
            {
                arr2[col][row]=sc.nextInt();
            }
        }

        System.out.println("The matrix 2 is :");
        for( int col=0;col<c;col++)
        {
            for(int row=0;row<r;row++)
            {
                System.out.print(arr2[col][row]);
                System.out.print(" ");
            }
            System.out.println("\n");

        }

        for(int col=0 ;col<c;col++)
        {
            for(int row=0;row<r;row++)
            {
                arr3[col][row]=arr1[col][row]+arr2[col][row];
            }
        }

        System.out.println("The Addition of the Matrix is :");
        for( int col=0;col<c;col++)
        {
            for(int row=0;row<r;row++)
            {
                System.out.print(arr3[col][row]);
                System.out.print(" ");
            }
            System.out.println("\n");

        }


        

        
    }

}