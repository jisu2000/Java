import java.math.BigInteger;

import javax.swing.text.StyledEditorKit.AlignmentAction;

public class Test {
    public static void main(String[] args) {
        BigInteger fact=BigInteger.valueOf(1);
        for(int i=2;i<=18;i++){
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        System.out.println(fact);
    }
    
}
