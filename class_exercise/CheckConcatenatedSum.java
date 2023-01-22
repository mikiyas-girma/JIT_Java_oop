 package class_exercise;

import java.util.Scanner;

public class CheckConcatenatedSum {
    public static int checkConcatenatedSum(int n, int catlen) {
        int sum = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            int contenated = 0;
            for (int i = 0; i < catlen; i++) {
                contenated = contenated * 10 + digit;
            }
            sum += contenated;
            temp /= 10;
        }
        if (sum == n) {
            return 1;
        } else {
            return 0;
        }
    }
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int n = s.nextInt();
        System.out.println("enter of times to concatenate each digits before summing");
        int catlen = s.nextInt();
        System.out.println(checkConcatenatedSum(n, catlen));
    }
}
