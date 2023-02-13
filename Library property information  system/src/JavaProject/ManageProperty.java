package JavaProject;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

    public class ManageProperty implements ManageItems {
         ArrayList<Book> bookList=new ArrayList<Book>();
        ArrayList<Computer> computerlist=new ArrayList<Computer>();

        // method to add a book to the list
        public void addBook() {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter book id: ");
            String id = sc1.nextLine();
            System.out.println("Enter book title: ");
            String title = sc1.nextLine();
            System.out.println("Enter book author: ");
            String author = sc1.nextLine();

            Book books = new Book(id,title,author);
            bookList.add(books);
        }

        public void removeBook(String id) {

            try {
                FileReader fileReader =
                        new FileReader("books.txt");
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                ArrayList<String> books = new ArrayList<String>();
                String line;

                     while ((line = bufferedReader.readLine()) != null) {
                         String[] book = line.split(",");
                         String bookId = book[0];

                         if (!bookId.equals(id)) {
                             books.add(line);
                         } else if (bookId.equals(id)) {
                             books.remove(id);
                             System.out.println("the book is successfully removed !");
                         }
                     }



                // Always close files.
                bufferedReader.close();

                FileWriter writer = new FileWriter("books.txt");
                for(String str: books) {
                    writer.write(str + System.lineSeparator());  // inorder to write the string on new line
                }
                writer.close();

            } catch (FileNotFoundException e) {
                System.out.println(" there is no such book in the books list");
            }

            catch(IOException ex) {
                System.out.println("Error reading file '" + "books.txt" + "'");
                // Or we could just do this:
                // ex.printStackTrace();
            }

        }

        // method for searching a book from the list
        public  Book searchBook() {
            Scanner scan3=new Scanner(System.in);
            System.out.println("enter book title or book's author to be searched :");
            String name = scan3.nextLine();
            ArrayList<String> books = new ArrayList<>();
            try {
                BufferedReader br = new BufferedReader(new FileReader("books.txt"));
                String line = null;
                while ((line = br.readLine()) != null) {
                    books.add(line);
                    }
                boolean foundBook=false;
                for (String book : books) {
                    if (book.contains(name)){
                        System.out.println("the book is found");
                        System.out.println(book);
                        foundBook=true;
                        break;
                    }
                }
                if (!foundBook){
                    System.out.println("the book is not found !!");
                }
                br.close();

            }catch (FileNotFoundException ex) {
                System.out.println("File Not Found!");
            }
            catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        public void addComputer() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Computer's id: ");
            String id = sc.nextLine();
            System.out.println("Enter computer model : ");
            String model = sc.nextLine();
            System.out.println("Enter computer's operating system : ");
            String operatingSystem = sc.nextLine();

            Computer computers=new Computer(id,model,operatingSystem);
            computerlist.add(computers);
        }

        public void removeComputer(String id) {
            ArrayList<String> computers=new ArrayList<>();

            try {
                BufferedReader br=new BufferedReader(new FileReader("computers.txt"));
                String line;
                while((line=br.readLine()) !=null) {
                    String[] computer=line.split(",");
                    String compId = computer[0];

                    if (!compId.equals(id)) {
                        computers.add(line);
                    } else if (compId.equals(id)) {
                        computers.remove(id);
                        System.out.println("the computer is successfully removed !");
                    }
                }


                br.close();
                FileWriter writer=new FileWriter("computers.txt");
                for(String str : computers) {
                    writer.write(str + System.lineSeparator());  // inorder to write the string on new line
                }
                writer.close();
            }catch (IOException e) {
                e.printStackTrace();
            }

        }
        public  Computer searchComputer(String id) {
            ArrayList<Computer> computers=new ArrayList<>();

            for (Computer computer : computers) {
                if (computer.getid().equals(id)) {
                    return computer;
                }
            }
            return null;
        }


        public void saveToBooks() {
            try {

                // write the book name to the file

                FileWriter bkw = new FileWriter("books.txt", true);
                PrintWriter pbw = new PrintWriter(bkw);

                for (Book b : bookList) {

                    pbw.println(b.getid() + "," + b.getTitle() + "," + b.getAuthor());

                }
                pbw.close();


                System.out.println("new book added to the list and saved to the book list");
            } catch (IOException e) {
                System.out.println("An error occurred while trying to save the property to the file.");
                e.printStackTrace();
            }
        }

        public void saveToComputers() {
            try {

                // write the computer name to the file

                FileWriter cpw = new FileWriter("computers.txt", true);
                PrintWriter pcw = new PrintWriter(cpw);

                for (Computer c : computerlist) {
                    pcw.println(c.getid() + "," + c.getModel() + "," + c.getOperatingSystem());
                }
                //     close the file

                pcw.close();

                System.out.println("new computer added to the list and saved to the file");
            } catch (IOException e) {
                System.out.println("An error occurred while trying to save the property to the file.");
                e.printStackTrace();
            }
        }

        }

        class Book {
             String id;
             String title;
             String author;

            public Book(String id,String title, String author) {
                this.id=id;
                this.title = title;
                this.author = author;

            }

            public String getAuthor() {
                return author;
            }


            public String getTitle() {
                return title;
            }
            public void setid() {
                this.id=id;
            }
            public String getid() {
                return id;
            }
            @Override
            public String toString() {
                return "book {" + "id=" + id + "title" + title +"author :" + author ;
            }
        }

class Computer {
        String id;
    private String model;
    private String operatingSystem;

    public Computer(String id,String model, String operatingSystem) {
        this.id=id;
        this.model = model;
        this.operatingSystem = operatingSystem;

    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public String getid() {
        return id;
    }
}

