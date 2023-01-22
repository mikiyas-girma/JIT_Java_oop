package JavaCourse;


//  Illustrations on java constructors

public class Geek {
// constructors with one argument
    Geek(String name){
        System.out.println("constructors with one string  argument   " +   name);
    }
// constructors with two arguments
    Geek(String name, int age){
        System.out.println("constructors with two " + "   String and integer  " + name +" "+ age);
    }
// constructors with different type argument
    Geek(long id) {
        System.out.println("constructors with different argument long  " +   id);
    }
}

 class TheCallers{
    public static void main(String[] args){
        // invoke constuctor with one string argument
        Geek Geek1=new Geek("mikiyas");
        // invoke constuctor with two arguments
        Geek Geek2=new Geek("mikiyas", 21);
        // invoke constructor with argument type long
        Geek Geek3=new Geek(2193);
    }
}
