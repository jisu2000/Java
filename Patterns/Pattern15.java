public class Pattern15 {

    //          *                     * 
    //          * *                 * * 
    //          * * *             * * * 
    //          * * * *         * * * * 
    //          * * * * *     * * * * * 
    //          * * * * * * * * * * * * 
    //          * * * * *     * * * * * 
    //          * * * *         * * * * 
    //          * * *             * * * 
    //          * *                 * * 
    //          *                     * 

    static void print(int n){
        
        
        for(int row=1;row<=(2*n)-1;row++)
        {
            int newrow=0;
            if(row<=n)
            {
                newrow=row;
            }
            else{
                newrow=(((2*n-1)-row)+1);
            }

            for(int col=1;col<=newrow;col++)
            {
                System.out.print("* ");
            }
            int space=(2*n-(2*newrow))*2;
            for(int i=1;i<=space;i++)
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
        print(6);
    }
    
}
