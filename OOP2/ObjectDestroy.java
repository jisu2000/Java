
class Obj{
    int data;

    Obj(int num){
        this.data=num;
        System.out.println("Object is Created With the value of "+num);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Destroyed");
    }
}



public class ObjectDestroy {

    public static void main(String[] args) {
        for(int i=0;i<1000000000;i++)
        {
            Obj a=new Obj(10);
        }
    }
}
