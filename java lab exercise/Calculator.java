package JavaCourse;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        System.out.print("how many numbers you want to multiply: ");
        Scanner console=new Scanner(System.in);
        int n=console.nextInt();
        System.out.println("enter numbers you want to multiply");
        // create array
        int[] array=new int[n];
        for(int i=0; i<n; i++){
            array[i]=console.nextInt();
        }

        multiply(array);
        System.out.println(" the product of the numbers = " + multiply(array));


    }

    public static int multiply(int...args){
        int product=1;

        for(int i: args){
            product *=i;
        }

        return product;

    }

}