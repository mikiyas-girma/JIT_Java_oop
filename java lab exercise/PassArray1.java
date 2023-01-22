package JavaCourse;

public class PassArray1 {

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // we can pass an array to the method using 1.
    public static void main(String[] array) {
        int[] a = {2, 4, 6, 8, 10};

        printArray(a);

        // or with the following also we can pass an array to printArray method

        printArray(new int[]{2,4,5,6,8,9,10});

    }


}
