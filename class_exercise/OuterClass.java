package class_exercise;

public class OuterClass {

    private int outerData;

    public OuterClass(int outerData) {
        this.outerData = outerData;
    }

    //Nested Inner Class
    class InnerClass {

        private int innerData;

        public InnerClass(int innerData) {
            this.innerData = innerData;
        }

        public int getInnerData() {
            return innerData;
        }

        public void printData(){
            System.out.println("Outer Data: " + outerData);
            System.out.println(" Inner Data: " + innerData);
        }
    }

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass(10);

        //Accessing the inner class
        OuterClass.InnerClass innerClass = outerClass.new InnerClass(20);
        innerClass.printData();
    }
}
