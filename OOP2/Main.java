public class Main {
    public static void main(String[] args) {
        Integer a=10;
        Integer b=20;

        System.out.println("A: "+a+"B: "+b);
        Swap(a,b);
        System.out.println("After Swap");
        System.out.println("A: "+a+"B: "+b);

    }

    public static void Swap(Integer a,Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }
}
