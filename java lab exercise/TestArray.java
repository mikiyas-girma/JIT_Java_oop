package JavaCourse;

public class TestArray {
    public static void main(String[] args) {

        double[] myList={1.3,1,6,32,22,4.1,5.6};

        // printing all array elements using for loop
        for(int n=0; n<myList.length; n++) {
            System.out.println(myList[n]);
        }
        // Summing all elements of the array
        double total=0;
        for(int n=0; n<myList.length; n++) {
            total +=myList[n];
        }
        System.out.println(" the total summation = " + total);

        // Finding the largest element from the array list
        double max=myList[0];
        for(int n=0; n<myList.length; n++){
            if(max<myList[n]) {
                max=myList[n];
            }
        }

        System.out.println(" the largest element is : " + max);

        // Finding the smallest element from the array

        double min=myList[0];
        for(int n=0; n<myList.length; n++) {
            if(min>myList[n]) {
                min=myList[n];
            }
        }
        System.out.println(" the smallest element is : " + min);


    }
}
