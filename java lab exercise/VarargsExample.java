package JavaCourse;

import java.util.Scanner;

public class VarargsExample {

    public static int multiply(int... args) {
        System.out.println(" argument length = " + args.length);
        int product = 1;
        for (int i : args) {
            product *= i;
        }
        return product;
    }

    public static void main(String[] args) {

        VarargsExample mu = new VarargsExample();

        System.out.println("product from inputed list = " + multiply(2,2,2));
            int product1 = mu.multiply(2, 4, 5);


            System.out.println("the product of the numbers = " + product1);

        }
    }

