import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GCD {

    public static int Gcd(ArrayList<Integer> list)
    {
        Collections.sort(list);
        int max=list.get(list.size()-1);
        int gcd=1;
        for(int i=1;i<=max;i++)
        {
            if(findpos(list, i))
            {
                gcd=i;
            }
        }
        return gcd;
    }

    public static boolean findpos(ArrayList<Integer> list,int n)
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)%n!=0)
            {
                return false;
            }
           
        }
        return true;
    }

public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<>();

    int product=1;

    Scanner sc=new Scanner(System.in);

    System.out.println("Enter How many element");

    int n=sc.nextInt();
    System.out.println("Enter "+n+" Elements");
   
    for(int i=0;i<n;i++){
        list.add(sc.nextInt());
        product*=list.get(i);
    }
    int ans=Gcd(list);
    System.out.println("GCD is "+ans);
    System.out.println("LCF is "+product/ans);



}
}
