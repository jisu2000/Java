package Static;

import static Static.Human.print;

public class Humanuse {
    public static void main(String[] args) {
        Human jisu=new Human("Jisu",22,false);
        Human sayan=new Human("Sayan",20,false);
        Human som=new Human("Somnath",21,true);


        print(jisu);
        print(sayan);
        print(som);

    }
}
