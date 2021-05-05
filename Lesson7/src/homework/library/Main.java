package homework.library;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        Library library = new Library();

        Book book = new Book(5, "aaaa");
        Book book2 = new Book(200, "cccc");
        Book book3 = new Book(9, "bbbb");
        Book book4 = new Book(112, "mmmm");

        Library.addBook(book);
        Library.addBook(book2);
        Library.addBook(book3);
        Library.addBook(book4);

        Application application = new Application();
        application.startProgram();

    }
}




