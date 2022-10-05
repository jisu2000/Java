public class Pattern13 {

    //            1
    //          2 1 2       
    //        3 2 1 2 3     
    //      4 3 2 1 2 3 4   
    //    5 4 3 2 1 2 3 4 5 

    static void print(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int space=n-row;
            for(int i=1;i<=space;i++)
            {
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--)
            {
                System.out.print(col+" ");
            }
            for(int col=2;col<=row;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print(5);
    }
}
