public class Pattern12 {

//        1 2 3 4 5 6 
//                5   
//              4     
//            3       
//          2
//        1 2 3 4 5 6 





    static void print(int n)
    {
        for(int row=1;row<=n;row++)
        {
            int newrow=1;
            if(row>1 && row<n)
            {
            {
               newrow=n-(row-1);
            }
            int prev=newrow-1;
            for(int i=0;i<prev;i++)
            {
                System.out.print("  ");
            }
            System.out.print(newrow+" ");
            int last=n-newrow;
            for(int i=0;i<last;i++)
            {
                System.out.print("  ");
            }
            System.out.println();
            
        }
        if(row==1 || row==n){
            for(int col=1;col<=n;col++)
            {
                System.out.print(col+" ");
            }
            System.out.println();
        }

        }
    }
    public static void main(String[] args) {
        print(6);
    }
    
}
