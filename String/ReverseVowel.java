//reverse all vowel

import java.util.ArrayList;
import java.util.Collections;

public class ReverseVowel{

    public static String reverseVowels(String s) {

        ArrayList<Character>list=new ArrayList<>(5);

        for(int i=0;i<s.length();i++)
        {
            if(isvowel(s.charAt(i)))
            {
                list.add(s.charAt(i));
            }
        }

        Collections.reverse(list);
       
        char[]ans=s.toCharArray();
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            if(isvowel(ans[i])){
                ans[i]=list.get(j);
                j++;
            }
        }

        String sc="";
        for(int i=0;i<s.length();i++)
        {
            sc=sc+ans[i];
        }

        return sc;

        
    }

    static boolean isvowel(char c)
    {
        return (c=='a') || (c=='e') || (c=='i') ||  (c=='o') || (c=='u') || (c=='A') || (c=='E') || (c=='I') || (c=='O') || (c=='U');
    }

    public static void main(String[] args) {
        String s="hello";

        String ans=reverseVowels(s);
        System.out.println(ans);
    }
}