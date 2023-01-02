package Static;

public class Human {
    String name;
    int age;
    Boolean Married;

    static int population;

   public Human(String name,int age,Boolean ans){
        this.name=name;
        this.age=age;
        this.Married=ans;
        population+=1;
    }

    public static void print(Human a)
    {
        String an="";
        if(a.Married)
        {
            an="Married";
        }
        else{
            an="Unmarried";
        }


        System.out.println("Name: "+a.name);
        System.out.println("Age: "+a.age);
        System.out.println("Relational Status: "+an);
        System.out.println("Current Population: "+Human.population);
    }

//
}
