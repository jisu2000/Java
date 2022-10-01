import java.util.*;

public class BalancedPara {

    static boolean ispar(String x)

    {

        Stack<Character> s = new Stack<>();

        for (int i = 0; i < x.length(); i++) {

            char cur = x.charAt(i);

            if (isOpening(cur)) {
                s.push(cur);
            }

            else {

                if (s.isEmpty()) {
                    return false;
                }

                else if (!isMatching(cur, s.peek())) {
                    return false;
                }

                else {
                    s.pop();
                }

            }

        }

        return s.isEmpty();

    }

    static boolean isOpening(char ctr) {
        return ctr == '(' || ctr == '[' || ctr == '{';
    }

    static boolean isMatching(char a, char b) {

        return (b == '(' && a == ')') || (b == '{' && a == '}') || (b == '[' && a == ']');

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.next();
        if(ispar(str))
        {
            System.out.println(str+" is a valid Parenthesis");
        }
        else{
            System.out.println(str+ "is not a valid Parenthesis");
        }
    }
}
