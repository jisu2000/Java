

public class LengthOfLast {
    public static int lengthOfLastWord(String s) {

        boolean first = false;
        int c = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isLetter(s.charAt(i))) {

                first = true;
                c++;

            }

            if (first && s.charAt(i) == ' ') {
                break;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int ans = lengthOfLastWord(s);
        System.out.println(ans);
    }
}
