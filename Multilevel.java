

     class A {
        A() {
             System.out.println("inside A's constructor");
         }
     }

     class B extends A {
         B() {
             System.out.println("insides B's constructor");
         }
     }

     class C extends B {
         C() {
             System.out.println("insides C's constructor");
         }
     }
public class Multilevel {
    public static void main(String[] args) {
        C c = new C();

    }
 }


