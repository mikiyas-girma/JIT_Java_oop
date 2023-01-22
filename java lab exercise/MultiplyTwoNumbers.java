package JavaCourse;

import java.util.Scanner;
// Java program that multiply two numbers using constructors
public class MultiplyTwoNumbers {
    // field variables
    double x;
    double y;
    double multiply(double x, double y){     // Method
        return (x*y);
    }
    MultiplyTwoNumbers(double x,double y) {    //  parameterized constructors
        this.x=x;
        this.y=y;
    }


    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter two numbers two multiply :");
        double x=scanner.nextDouble();
        double y=scanner.nextDouble();
        MultiplyTwoNumbers n;  // declaring an object
        n=new MultiplyTwoNumbers(x,y);   // instantiating the object

        System.out.println("Result = " + n.multiply(x,y));
    }
}
