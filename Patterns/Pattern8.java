public class Pattern8 {

//      *   
//     * *  
//    * * * 
//   * * * *
//  * * * * *
//   * * * *
//    * * *
//     * *
//      *
   
 static void print(int n)
    {
        for(int row=1;row<=(2*n-1);row++)
        {
            int newrow=0;
            
            if(row<=n)
            {
                newrow=row;
            }
            else{
                newrow=(((2*n)-1)-row)+1;
            }
            int space=(n-newrow);
            for(int i=0;i<space;i++)
            {
                System.out.print(" ");
            }
            for(int col=1;col<=newrow;col++)
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
