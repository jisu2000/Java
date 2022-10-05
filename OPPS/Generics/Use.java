class Pair<T,S>{
    private T first;
    private S second;

    public Pair(T f, S s)
    {
        this.first=f;
        this.second=s;
    }
    public T getf(){
        return first;
    }

    public void setf(T f)
    {
        this.first=f;
    }
    public S gets()
    {
        return second;
    }
    public void sets(S s)
    {
        this.second=s;
    }
}
public class Use{
    public static void main(String[] args) {
        Pair<Integer,String> use1=new Pair<>(10,"jisu");
        System.out.println(use1.gets());
    }

}