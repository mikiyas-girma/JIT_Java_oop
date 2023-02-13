package JavaProject;

import java.io.*;
import java.util.*;

public class Display {

    public void userList(){
        ArrayList<String> usrlist = new ArrayList<>();

        try {

            File file = new File("userlist.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                usrlist.add(sc.nextLine());
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String usr : usrlist) {
            System.out.printf("%-50s",usr);
            System.out.println();
        }
    }

    // reading books from file used to show the list of available books
    public void ReadFromBooks() {

        ArrayList<String> bookList = new ArrayList<>();

        try {

            File file = new File("books.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                bookList.add(sc.nextLine());
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("All the available books in the library are:-");
        for (String book : bookList) {
            System.out.printf("%-50s",book);
            System.out.println();
        }
    }

    // used to display list of available  computers
    public void ReadFromComputer() {

        ArrayList<String> computerlist=new ArrayList<>();


        try {

            File file = new File("computers.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                computerlist.add(sc.nextLine());
            }
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("All the available computers in the library are:-");
        for (String computer : computerlist) {
            System.out.printf("%-50s",computer);
            System.out.println();
        }
    }
}

