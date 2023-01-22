package JavaCourse;

public class Student {
      public   String name;
      public int roll_no;



      public Student(){
              name="mikiyas";
              roll_no=21;
      }

        Student(String name, int roll_no){
                this.name=name;
                this.roll_no=roll_no;

        }

        public static void main(String[] args){

                Student st1;
                st1=new Student("John",2);
                System.out.println("Name  : " + st1.name);
                System.out.println("Roll number : " + st1.roll_no);


                Student st2=new Student();
                System.out.println("my name is : " + st2.name);
                System.out.println("my roll number is : " + st2.roll_no);
        }

}
