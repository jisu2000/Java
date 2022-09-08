public class Parenthesis {
    public static void main(String[] args) {
        String a="{[(";
        StringBuilder s=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(a.charAt(i)=='[')
            {
                s.append("]");
            }
            
             if(a.charAt(i)==']')
            {
                s.append('[');
            }
             if(a.charAt(i)=='(')
            {
                s.append(')');
            }
             if(a.charAt(i)==')')
            {
                s.append("(");
            }
             if(a.charAt(i)=='{')
            {
                s.append('}');
            }
             if(a.charAt(i)=='}')
            {
                s.append('{');
            }
            
        }

        
        System.out.println(s);
        
    }

}
