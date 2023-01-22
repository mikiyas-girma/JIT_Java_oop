package class_exercise;

import java.util.Scanner;

//(q4) a method named islegal ....

public class LegalNumer {
    public static int isLegalNumber(int[] arr, int base) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= base) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("enter the array of digits");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
            System.out.println("enter base number for the numbers entered above");
            int base = sc.nextInt();
            System.out.println(isLegalNumber(arr,base));

            //System.out.println(isLegalNumber(new int[] {3, 2, 1}, 4));
            //System.out.println(isLegalNumber(new int[] {3, 7, 1}, 6));
        }
    }


