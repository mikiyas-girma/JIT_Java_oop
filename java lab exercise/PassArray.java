package JavaCourse;

import java.util.Scanner;

/**
 * This program demonstrates passing an array as an
 * argument to method.
 */
public class PassArray
{
    public static void main(String[] args)
    {
        final int SIZE = 4;    // Size of the array

        // Create an array.
        int[] array = new int[SIZE];

        // Pass the array to the fillArray method.
        fillArray(array, SIZE);
        System.out.println("Numbers are :");

        // Pass the array to the printArray method.
        printArray(array, SIZE);
    }

    /**
     * The fillArray method accepts an array as
     * an argument. Each of its Element is filled by user.
     */
    private static void fillArray(int[] list, int n)
    {
        // Create a Scanner object for keyboard input.
        Scanner console = new Scanner(System.in);

        System.out.println("Enter " + n + " integers");

        for (int i = 0; i < n; i++)
        {
            list[i] = console.nextInt();
        }
    }

    /**
     * The printArray method accepts an array as
     * an argument displays its contents.
     */
    public static void printArray(int[] list, int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(list[i] + " ");
        }
    }
}
