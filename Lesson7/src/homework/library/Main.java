package homework.library;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        Book book = new Book(5, "re-re");
        Book book2 = new Book(200, "ty-ty");
        Book book3 = new Book(9, "ki-ki");
        Book book4 = new Book(112, "ve-ve");

        library.addBook(book);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.println(library.listBooks);
        library.delBook(200);
        System.out.println(library.listBooks);
        library.bookCorrection(library.listBooks);
        System.out.println(library.getListBooks(library.listBooks));

/*        ArrayList<String> sortTitle = new ArrayList<String>(library.listBooks.containsValue());

        TreeMap<Integer,Book> sortTitleBook = new TreeMap<>(library.listBooks);

        TreeMap<Integer,Book> sortTitleBook = new TreeMap<>();
        sortedMap.putAll(map);

        System.out.println(sortTitleBook);*/
    }
}




