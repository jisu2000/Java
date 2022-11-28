import java.util.Scanner;

public class Palindrome{



    static boolean ispalindrome(String str)
    {

        
        str=str.toLowerCase();
        if(str==null || str.length()==0)
        {
            return true;
        }
        for(int i=0;i<=str.length()/2;i++)
        {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter a String:");
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(ispalindrome(s))
        {
            System.out.println(s+" is Palindrome");
        }
        else{
            System.out.println(s+" is not Palindrome");
        }
    }
}