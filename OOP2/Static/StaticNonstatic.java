package Static;

public class StaticNonstatic {
    public static void main(String[] args) {
        StaticGreet();
        StaticNonstatic b=new StaticNonstatic();
        b.NonStaticGreet();
    }

     static void StaticGreet(){
//        System.out.println("I am from a static function");    Inside any Static function we can not use a non static
//                                                                function because the static does not depend on an object
//                                                                    but the Nonstatic does
//        NonstaticGreet();

//        But If I refer an Object then use if as the Object Properties I will be able to use the Nonstatic function

        StaticNonstatic a=new StaticNonstatic();
        a.NonStaticGreet();



    }

     void NonStaticGreet(){
        System.out.println("I am from a non static function");
        StaticGreet();            //We can use a static function in a Nonstatic function//
    }
}
