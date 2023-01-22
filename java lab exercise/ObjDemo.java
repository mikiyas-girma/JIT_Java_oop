package JavaCourse;

// illustrating the different types of constructors

class Rectangle{
    float height;
    float width;

    float calculateArea(float h, float w) {

        return (h * w);
    }
    Rectangle(){  // parameterless constructor

        }
    Rectangle(float h,float w){   // parameterized constructor
        height=h;
        width=w;
        }
    }


public class ObjDemo {
    public static void main(String[] args) {
    Rectangle rect1, rect2;  //  declaring field  variables
     rect1=new Rectangle();   // instantiating and initializing the class object by calling parameterless constructor
        System.out.println("Rect1 values");
        System.out.println("height : " + rect1.height);
        System.out.println("width :" + rect1.width);
        System.out.println("Area for rect1  is =" + rect1.calculateArea(rect1.height, rect1.width));
        System.out.println("Rect 1 finished");

        rect2=new Rectangle(5,6);  //instantiating and initializing the class object by calling parameterized constructor
        System.out.println("Rect2 values");
        System.out.println("height :" + rect2.height);
        System.out.println("width :" + rect2.width);
        System.out.println(" Rect2 Area = " + rect2.calculateArea(rect2.height, rect2.width) );
    }

}
