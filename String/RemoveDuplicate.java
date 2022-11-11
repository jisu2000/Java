import java.util.Stack;

public class RemoveDuplicate {

    public static String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {

            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else if (issame(stack.peek(), s.charAt(i))) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }

        }
        String ans = "";

        while (!stack.isEmpty()) {
            ans = ans + stack.peek();
            stack.pop();
        }
        StringBuilder sb = new StringBuilder(ans);
        sb.reverse();
        s = sb.toString();
        return s;

    }

    public static boolean issame(char a, char b) {
        return a == b;
    }

    public static void main(String[] args) {
        String s = "abbaca";

        s = removeDuplicates(s);

        System.out.println(s);
    }

}