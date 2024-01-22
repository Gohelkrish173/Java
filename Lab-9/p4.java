/* Declare a class called book having author_name as private data member. Extend book class to have two sub classes called
 book_publication & paper_publication. Each of
these classes have private member called title. Write a program to show usage of dynamic method dispatch (dynamic polymorphism)
 to display book or paper publications of
given author. Use command line arguments for inputting data.*/


class Book{
    private String author_name;

    Book(String author_name){
        this.author_name=author_name;
    }
}

class book_publication extends Book{
    private String titel;
    book_publication(String titel,String author_name){
        super(author_name);
        this.titel=titel;
        System.out.println("Author Name : "+ author_name);
        System.out.println("Title Name : "+ titel);
    }
}

class paper_publication extends Book{
    private String titel;
    paper_publication(String titel,String author_name){
        super(author_name);
        this.titel=titel;
        System.out.println("Author Name : "+ author_name);
        System.out.println("Title Name : "+ titel);
    }
}

public class p4{
    public static void main(String[] args){
        System.out.println("Enter Name of author-1 :"+args[0]);
        System.out.println("Enter Name of author-2 :"+args[1]);
        System.out.println("Enter Name of Titel-1 :"+args[2]);
        System.out.println("Enter Name of Titel-2 :"+args[3]+"\n");

        System.out.println("Detail of Book Publication\n");
        Book d1=new book_publication(args[2],args[0]);
        System.out.println("\n");

        System.out.println("Detail of Paper Publication\n");
        Book d2=new paper_publication(args[3],args[1]);
    }
}