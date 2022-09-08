public class NumofDigit {

    public static void main(String[] args) {
        System.out.println(count(12));
       
    }
    public static int count(int n){
        if(n==0){
        return 0;
    }
    return count(n/10)+1;
}
}
