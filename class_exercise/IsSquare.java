package class_exercise;

// (q2) a method named issquare....
public class IsSquare {

    public static int isSquare(int num) {
        for (int i = 0; i <= num; i++) {
            if (i*i == num) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int num = 16;
        int result = isSquare(num);
        System.out.println(result);
    }
}
