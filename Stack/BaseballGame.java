import java.util.Stack;

public class BaseballGame {
    public static int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            if (operations[i].equals("C")) {
                stack.pop();
            }

            else if (operations[i].equals("D")) {
                stack.push(stack.peek() * 2);
            }

            else if (operations[i].equals("+")) {
                int a = stack.pop();
                int b = stack.pop();

                stack.push(b);
                stack.push(a);
                stack.push(a + b);
            }

            else {
                stack.push(Integer.parseInt(operations[i]));
            }

        }

        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;

    }

    public static void main(String[] args) {
        String ops[] = { "5", "-2", "4", "C", "D", "9", "+", "+" };

        System.out.println(calPoints(ops));
    }

}
