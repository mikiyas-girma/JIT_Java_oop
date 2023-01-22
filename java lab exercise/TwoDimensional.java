package JavaCourse;

public class TwoDimensional {

    public static void main(String[] args) {
        int[][] a2 = {{2, 4}, {6, 8}, {10, 12}, {14, 16}};
        //printing two-dimensional array even if we do not know the size of the array
        for (int r = 0; r < a2.length; r++) {
            for (int c = 0; c < a2[r].length; c++) {
                System.out.print("   " + a2[r][c]);
            }
            System.out.println("");
        }
    }


}