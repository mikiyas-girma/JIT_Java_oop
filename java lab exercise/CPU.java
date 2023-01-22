package JavaCourse;
    // Demonstrating non-static nested classes or inner classes
public class CPU {
    double price;

    // inner nested class
    class Processor {
        double cores;
        String manufacturer;

        double getCache(){
            return 4.5;
        }
    }
    // protected nested inner class inside outer class CPU

        protected class RAM{
            double memory;
            String manufacturer;

            double getClockSpeed(){
                return 5.3;
            }
        }


        public static void main(String[] args){

            CPU cpu=new CPU();  // instantiating the outer class CPU

            // now we can create object for the inner classes
            CPU.Processor processor=cpu.new Processor();
            CPU.RAM ram=cpu.new RAM();

            System.out.println("Processor cache : " + processor.getCache());
            System.out.println("RAM clock speed :" + ram.getClockSpeed());


        }




}
