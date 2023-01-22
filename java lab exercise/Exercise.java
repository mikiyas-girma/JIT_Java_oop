package JavaCourse;

class Students{
    String name;
    int roll_no;
    int phone_no;
    String address;

}

public class Exercise {
        public static void main(String[] args){

            Students st1,st2;
            st1=new Students();
            st2=new Students();

            st1.name="Sam";
            st1.roll_no=1;
            st1.phone_no=97974554;
            st1.address="America";

            st2.name="John";
            st2.roll_no=2;
            st2.phone_no=96949544;
            st2.address="England";

            System.out.println("name : " + st1.name);
            System.out.println("roll number : " + st1.roll_no);
            System.out.println("Phone number : " + st1.phone_no);
            System.out.println("Address : " + st1.address);

            System.out.println("name : " + st2.name);
            System.out.println("roll number : " + st2.roll_no);
            System.out.println("Phone number : " + st2.phone_no);
            System.out.println("Address : " + st2.address);



        }



}
