import java.util.ArrayList;
import java.util.Collections;



public class ArraylistADD {
    public static void main(String[] args) {
        ArrayList<String> people=new ArrayList<String>();
       
            people.add("ram");
            people.add("ratan");
            people.add("shyam");
            people.add(3,"jisu");
            people.remove(1);
        System.out.println(people);
        System.out.println(people.get(1));
        Collections.sort(people);
        System.out.println(people);
        
    }

    
}
