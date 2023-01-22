package JavaCourse;
        // Demonstrating accessing members of outer class in nested inner classes
public class Car {
    String carName;
    String carType;

    public Car(String name, String type) {    // assigning values using constructor
        this.carName=name;
        this.carType=type;
    }

    private String getCarName(){
        return this.carName;
    }

    class Engine{
        String engineType;
        void setEngine(){
            // NOW accessing members of the outer class
            if(Car.this.carType.equals("4WD")){
                if(Car.this.getCarName().equals("MAZDA")){
                    this.engineType="smaller";
                }
                else {
                    this.engineType="bigger";
                }
            }
            else {
                this.engineType="BIGGER";
            }

        }
        String getEngineType(){
            return this.engineType;
        }

    }





        public static void main(String[] args){

        Car car1=new Car("MAZDA", "4WD");  // creating object for outer class

            Car.Engine engine=car1.new Engine();
            engine.setEngine();
            System.out.println(" engine type for 4WD : " + engine.getEngineType());

            Car car2 = new Car("Crysler", "8WD");
            Car.Engine c2engine = car2.new Engine();
            c2engine.setEngine();
            System.out.println("Engine Type for 8WD = " + c2engine.getEngineType());


        }


}
