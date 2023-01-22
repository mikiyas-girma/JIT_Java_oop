package JavaCourse;

import java.util.Scanner;

public class VarargExample {
    public static int sumNumber(int... args){
        int sum=0;
        for(int i: args){
            sum += i;
        }
            return sum;
    }

    public static void main(String[] args){

        System.out.println("how many numbers are you going to add");
        Scanner console=new Scanner(System.in);
        int n= console.nextInt();   //  determining the size of the array

        int[] array=new int[n];//  creating an array
        System.out.println("enter numbers to add");
        for(int i=0; i<n; i++){
            array[i]=console.nextInt();
        }

        sumNumber(array);
        System.out.println("the summation = " + sumNumber(array));



        // using pre initialized values as the following
//        VarargExample ex=new VarargExample();
//
//        int sum2=ex.sumNumber(2,4);
//        System.out.println("sum 2 = " + sum2);
//        int sum3=ex.sumNumber(3,4,5);
//        System.out.println("Sum 3 = " + sum3);
    }
}
