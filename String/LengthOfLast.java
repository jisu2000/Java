import java.util.Stack;

public class LengthOfLast {
    public static  int lengthOfLastWord(String s) {
        
        Stack<Character> stack=new Stack<>();

        boolean first=false;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(Character.isLetter(s.charAt(i)))
            {
                stack.push(s.charAt(i));
                first=true;
            }

            if(first && s.charAt(i)==' ')
            {
                break;
            }
        }
        return stack.size();
    }
    public static void main(String[] args) {
        String s="   fly me   to   the moon  ";
        int ans=lengthOfLastWord(s);
        System.out.println(ans);
    }
}
