package Inheritance;

class Animal {
    String name;

    public void eat() {
        System.out.println("I can eat");
    }
}
class Dog extends Animal {
    public void display(){
        System.out.println("my name is "+ name);
    }
    // the following method will override the method in the superclass Animal
    // @Override  // but this annotation is not mandatory
    public void eat(){
        super.eat(); // this invokes method that is in the super class)
        System.out.println("I eat dog food");
    }
    public void bark(){
        System.out.println("I can bark");
    }
}
class Main{
    public static void main(String[] args){
        Dog labrador=new  Dog();

        labrador.name="mechal";
        labrador.display();
        labrador.eat();
        labrador.bark();
    }

}
