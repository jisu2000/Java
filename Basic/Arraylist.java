import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){
    ArrayList<Integer>list =new ArrayList<Integer>(5);
    list.add(5);
    list.add(6);
    list.add(7);

    list.set(0,7);
    
    System.out.println(list);
    System.out.println(list.contains(6));
    System.out.println(list.get(0));


   
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    for (int i = 0; i < cars.size(); i++) {
      System.out.println(cars.get(i));
    }
  
 }
}


