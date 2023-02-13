package JavaProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {

        int menuchoice;
        int adminchoice;
        int userchoice;
        int taskOptionChoice;
        int removeOptionChoice;
        int showChoice;
        int searchChoice;
        Scanner scan = new Scanner(System.in);
        UserPage usr = new UserPage();
        ManageProperty mylist = new ManageProperty();
        Display showfile = new Display();
        try {

                System.out.println("welcome to Library property management system");
                System.out.println("Log in as");
                System.out.println("1.Admin");
                System.out.println("2.User");
                System.out.println("3. to exit..");
                Scanner scanner = new Scanner(System.in);
                menuchoice = scanner.nextInt();
                mainmenu:
                {
                    switch (menuchoice) {
                        case 1:
                            System.out.println("\nPlease enter your login details: ");
                            System.out.print("Username: ");
                            String adminname = scanner.next();
                            System.out.print("Password: ");
                            String adminpassword = scanner.next();

                            if (Login.checkCredentials(adminname, adminpassword)) {
                                System.out.println("Logged in successfully");
                                do mainpage:{
                                    System.out.println("Main page");
                                    System.out.println("1. Add a item");
                                    System.out.println("2. Remove a item");
                                    System.out.println("3. show list  of all items");
                                    System.out.println("4. search item");
                                    System.out.println("5. list of users who rented property");
                                    System.out.println("6.  to exit !!");

                                    adminchoice = scanner.nextInt();

                                    Scanner scanner1 = new Scanner(System.in);
                                    char a;
                                    switch (adminchoice) {
                                        case 1:
                                            do {
                                                System.out.println("additions of items :");
                                                System.out.println("1. Add a books");
                                                System.out.println("2. add computers");
                                                System.out.println("3. back to main page !!");

                                                taskOptionChoice = scanner1.nextInt();

                                                switch (taskOptionChoice) {
                                                    case 1:
                                                        do {
                                                            System.out.println("Add a book");
                                                            mylist.addBook();
                                                            System.out.println("do you want to add another? (y/n)");
                                                            a = scanner1.next().charAt(0);

                                                        } while (a == 'y');
                                                        mylist.saveToBooks();
                                                        break;
                                                    case 2:
                                                        char c;
                                                        do {
                                                            System.out.println("add a computer :");
                                                            mylist.addComputer();
                                                            System.out.println("do you want to add another? (y/n)");
                                                            c = scanner.next().charAt(0);

                                                        } while (c == 'y');
                                                        mylist.saveToComputers();
                                                        break;
                                                    case 3:
                                                        System.out.println("back to addition of items");
                                                        break mainpage;
                                                    default:
                                                        System.out.println(" please enter correct choice !!!");


                                                }
                                            } while (taskOptionChoice != 0);
                                            break;

                                        case 2:
                                            Scanner scanner2 = new Scanner(System.in);
                                            char r;
                                            do {
                                                System.out.println("Remove ...");
                                                System.out.println("1. Remove book");
                                                System.out.println("2. Remove computer");
                                                System.out.println("3. back to mainpage");

                                                removeOptionChoice = scanner2.nextInt();

                                                switch (removeOptionChoice) {
                                                    case 1:
                                                        do {
                                                            System.out.println("enter book id to be deleted :");
                                                            String bookid = scanner1.nextLine();
                                                            mylist.removeBook(bookid);
                                                            System.out.println("do you want to remove another book (y/n)");
                                                            r = scanner2.next().charAt(0);

                                                        } while (r == 'y');
                                                        break;

                                                    case 2:
                                                        do {

                                                            System.out.println("enter computer id to be delete :");
                                                            String compId = scanner1.nextLine();
                                                            mylist.removeComputer(compId);
                                                            System.out.println("do you want another computer to be removed (y/n)");
                                                            r = scanner.next().charAt(0);
                                                        } while (r == 'y');
                                                        break;

                                                    case 3:
                                                        break mainpage;
                                                    default:
                                                        System.out.println(" please enter correct choice !!");
                                                }
                                            } while (removeOptionChoice !=0);
                                            break;

                                        case 3:
                                            do {
                                                System.out.println("1. Show list of books in the library");
                                                System.out.println("2. show list of computers in the library");
                                                System.out.println("3. back to mainpage");

                                                showChoice = scanner.nextInt();

                                                switch (showChoice) {
                                                    case 1:
                                                        System.out.println("List of available books in the library");
                                                        showfile.ReadFromBooks();
                                                        break;
                                                    case 2:
                                                        System.out.println("List of available computers ");
                                                        showfile.ReadFromComputer();
                                                        break;

                                                    case 3:
                                                        break mainpage;
                                                }
                                            } while (showChoice != 3);
                                        case 4:
                                            do {
                                                System.out.println("1. search books");
                                                System.out.println("2. search computers");
                                                System.out.println("3. back to mainpage");

                                                searchChoice = scanner.nextInt();

                                                Scanner scanner3 = new Scanner(System.in);
                                                char s;
                                                switch (searchChoice) {
                                                    case 1:
                                                        do {
                                                            mylist.searchBook();
                                                            System.out.println(" do you want to search another (y/n)");
                                                            s = scanner.next().charAt(0);
                                                        } while (s == 'y' || s == 'Y');
                                                        break;
                                                    case 2:
                                                        do {
                                                            System.out.println("enter computer id to be searched :");
                                                            String id = scanner3.nextLine();
                                                            mylist.searchComputer(id);
                                                            System.out.println(" do you want to search another (y/n)");
                                                            s = scanner.next().charAt(0);
                                                        } while (s == 'y');
                                                        break;
                                                    case 3:
                                                        break mainpage;
                                                }
                                            } while (searchChoice != 3);

                                        case 5:
                                            System.out.println("list of users who had rented property");
                                            System.out.println(" name " + "  id  " + "  dep  " + "  phone no  ");
                                            showfile.userList();
                                            break;
                                        case 6:
                                            break mainmenu;

                                    }

                                } while (adminchoice != 6);
                            } else {
                                System.out.println("!! Incorrect username or Password");
                                Main.main(args);
                            }

                        case 2:
                            System.out.println("\nPlease enter your login details: ");
                            System.out.print("Username: ");
                            String username = scanner.next();
                            System.out.print("Password: ");
                            String userpassword = scanner.next();

                            if (Login.checkCredentials(username, userpassword)) {
                                System.out.println("Logged in successfully");
                                do mainpage:{
                                    System.out.println("Main page");
                                    System.out.println("1.Rent item");
                                    System.out.println("2. Search item");
                                    System.out.println("3. show  items");
                                    System.out.println("4. enter  exit");

                                    userchoice = scan.nextInt();
                                    char f;
                                    switch (userchoice) {
                                        case 1:
                                            usr.rentBook();
                                            usr.saveToUserlist();
                                            break;
                                        case 2:
                                            do {
                                                mylist.searchBook();
                                                System.out.println(" do you want to search another (y/n)");
                                                f = scanner.next().charAt(0);
                                            } while (f == 'y' || f == 'Y');
                                            break;
                                        case 3:
                                            do {
                                                System.out.println("1. Show list of books in the library");
                                                System.out.println("2. show list of computers in the library");
                                                System.out.println("3. back to mainpage");

                                                showChoice = scanner.nextInt();

                                                switch (showChoice) {
                                                    case 1:
                                                        System.out.println("List of available books in the library");
                                                        showfile.ReadFromBooks();
                                                        break;
                                                    case 2:
                                                        System.out.println("List of available computers ");
                                                        showfile.ReadFromComputer();
                                                        break;

                                                    case 3:
                                                        break mainpage;
                                                }
                                            } while (showChoice != 0);

                                        case 4:
                                            break mainmenu;

                                    }
                                } while (userchoice != 4);

                            } else {
                                System.out.println("incorrect credentials!!!");
                                Main.main(args);
                            }
                        case 3:
                            break mainmenu;
                        default:
                            System.out.println(" please enter correct choice !");
                    }
                    System.out.println(" wrong response !!");
                    main(args);

                }

        } catch (InputMismatchException e) {
            System.out.println(" please enter a number ....");
            main(args);
        }
    }
}






