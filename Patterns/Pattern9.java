public class Pattern9 {

//      * 
//     * * 
//    * * * 
//   * * * * 
//  * * * * * 

   static void print(int n)
    {
        for(int row=1;row<=n;row++)
        
        {
            int space=n-row;
            for(int i=1;i<=space;i++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
    }
    public static void main(String[] args) {
        print(5);
        
    }
}
