package class_exercise;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = i;
            } else if (i > secondLargest && i != firstLargest) {
                secondLargest = i;
            }
        }
        System.out.println("Second largest element in the array is: " + secondLargest);
    }
}

