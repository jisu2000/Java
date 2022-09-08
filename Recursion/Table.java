public class Table {
    
    static void  cal (int num,int time)
    {
        if(time>10)
        return;
       
        System.out.println(num +"x"+time+"=" +time*num);
        
         cal(num,time+1);
    }
    public static void main(String[] args) {
        
        cal(2,1);
    }
}
