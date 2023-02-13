package JavaProject;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserPage {

    ArrayList<user> userList=new ArrayList<user>();

    public void rentBook() {
        System.out.println("\n<!---Please Fill out order Form--->");
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter your Name :");
            String name = scan.nextLine();
            System.out.print("Enter Id :");
            String Id = scan.nextLine();
            System.out.print("Enter Department :");
            String Dep = scan.nextLine();
            System.out.print("Enter PhoneNumber :");
             int phon = scan.nextInt();

            user usr = new user(name,Id,Dep,phon);
            userList.add(usr);

        } catch (InputMismatchException var3) {
            System.out.println("!Wrong response//");
            System.out.println(" please enter again correctly");
                rentBook();
        }
    }

    public void saveToUserlist() {
        try {

            // write the book name to the file

            FileWriter bkw = new FileWriter("userlist.txt", true);
            PrintWriter pbw = new PrintWriter(bkw);

            for (user u : userList) {

                pbw.println(u.getname() + "," + u.getid() + "," + u.getDep() + "," +  u.getPhon());

            }
            pbw.close();


            System.out.println("user added to the list and saved to the user list");
        } catch (IOException e) {
            System.out.println("An error occurred while trying to save the property to the file.");
            e.printStackTrace();
        }
    }
}
class user {
    String name;
    String id;
    String dep;
    int phon;

    public user(String name,String id, String dep, int phon ) {
        this.name=name;
        this.id = id;
        this.dep = dep;
        this.phon=phon;

    }

    public String getname() {
        return name;
    }


    public String getDep() {
        return dep;
    }
    public void setid() {
        this.id=id;
    }
    public String getid() {
        return id;
    }
    public  int getPhon(){
        return phon;
    }
    public void setPhon(){
        this.phon=phon;
    }
    @Override
    public String toString() {
        return "user {" + "name=" + name + "id" + id +"dep :" + dep + "phone no "+ phon ;
    }
}
