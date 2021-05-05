package homework.library;
import java.util.Collections;
import java.util.Comparator;


import java.util.*;

public class Library {

    static Map<Integer, Book> listBooks = new HashMap<>();

    // метод вставки книги по id
    public static void addBook(Book book) {
        if (!listBooks.containsKey(book.getId())) {
            listBooks.put(book.getId(), book);
            System.out.println("книга добавлена в колл. " + listBooks.get(book.getId()));
        } else {
            System.out.println("id " + book.getId() + " книги уже занят. Введите другой id!");
        }
    }

    //метод возрата всех книг библиотеки.

    public static Map<Integer, Book> getListBooks(Map<Integer, Book> listBooks) {
        return listBooks;

    }

    //удаление книги по id
    public static void delBook(int id) {
        if (listBooks.containsKey(id)) {
            listBooks.remove(id);
        } else {
            System.out.println("Введите другой id, данного id не существует!");
        }
    }

    //корректировка книги
    public static void bookCorrection(int idBook) {

        if (listBooks.containsKey(idBook)) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Введите название новой книги---> ");
            String titleBook = scanner2.nextLine();
            listBooks.get(idBook).setTitle(titleBook);
            System.out.println(getListBooks(listBooks));
        } else {
            System.out.println("Введите другой id, данного id не существует!");
        }
    }

    //метод сотрировки книг
    public static void sortBook(int sortList){


        List<Book> list = new ArrayList<Book>( listBooks.values());
        switch (sortList){
            case 1:
                list.sort(Comparator.comparing(Book::getTitle));
                System.out.println(list.toString());
                break;
            case 2:
                list.sort(Collections.reverseOrder(Comparator.comparing(Book::getTitle)));
                System.out.println(list.toString());
                break;
        }
    }
}

