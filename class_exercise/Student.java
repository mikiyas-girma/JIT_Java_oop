package class_exercise;

public class Student {
    //a. With field /class variables
    private int studentId;
    private String studentName;
    private double[] incomes;
    private double totalIncome;
    private static final int MAX_NUM_INCOMES = 10;

    //b. Create constructor
    public Student(int studentId, String studentName) {
        //g. example for ‘this’, (parameter name same as filed variable), method, constructor call, (must be first statement in con)
        this.studentId = studentId;
        this.studentName = studentName;
    }

    //c. Create setters and getter methods
    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getTotalIncome() {
        return this.totalIncome;
    }

    //(d). Create a method to calculate total salary given args
    public void calculateTotalIncome(double... incomes) {
        //f. Static variable, method , final keyword
        double total = 0.0;
        for (int i = 0; i < Math.min(MAX_NUM_INCOMES, incomes.length); i++) {
            total += incomes[i];
        }
        this.totalIncome = total;
    }

    //e. Method overloading
    public double calculateTotalIncome(double firstIncome, double secondIncome) {
        //f. Static variable, method , final keyword
        return Math.min(MAX_NUM_INCOMES, firstIncome + secondIncome);
    }

    //h. Object referencing, calling inside constructors
    public Student(int studentId, String studentName, Student obj) {
        this.studentId = studentId;
        this.studentName = studentName;
        //h. Object referencing, calling inside constructors
        this.incomes = obj.incomes;
    }

}
