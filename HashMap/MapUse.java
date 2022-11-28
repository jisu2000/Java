import java.util.HashMap;
import java.util.Set;

public class MapUse {
    
    public static void main(String[] args) {
        
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Jisu",1);
        map.put("Somnath",2);   //Putting Values and keys//
        map.put("Subhajit",3);
        System.out.println(map.get("Jisu")); // Getting values for the Coressponding keys

        System.out.println(map.containsKey("Sayan")); // Checking if a key contains in map

        map.remove("Somnath"); //Removing Key from Hashmap

        System.out.println(map.get("Somnath")); 

        Set<String> keys=map.keySet();   // Converting Map to Set to get all keys

        for(String s:keys)
        {
            System.out.println(s);
        }
    }
}
