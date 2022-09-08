public class Pattern10{
 
    // * * * * * 
    //  * * * *  
    //   * * *   
    //    * *    
    //     *  

    
    static void print(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int space =((n+row)-1)-n;
            for(int i=0;i<space;i++)
            {
                System.out.print(" ");
            }

            for(int col=1;col<=(n-row)+1;col++)
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