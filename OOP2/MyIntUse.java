class MyInt {
    int data;
    MyInt(int num){
        this.data=num;
    }
}

public class MyIntUse{

    public static void main(String[] args) {


        MyInt a = new MyInt(10);
        MyInt b = new MyInt(20);

        System.out.println("The Previous Value was " +a.data+ " " + b.data);
        swap(a,b);
        System.out.println("After Swapping The Value became " +a.data+ " " + b.data);

    }

    static void  swap(MyInt a, MyInt b)
    {
        int temp=a.data;
        a.data=b.data;
        b.data=temp;
    }
}
