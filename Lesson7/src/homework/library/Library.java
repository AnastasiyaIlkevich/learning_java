package homework.library;


import java.util.HashMap;
import java.util.Map;

public class Library {

    Map<Integer, Book> listBooks = new HashMap<>();//возможно должен быть примитив

    // метод вставки книги по id
    public void addBook(Book book) {
        if (!listBooks.containsKey(book.getId())) {
            listBooks.put(book.getId(), book);
            System.out.println("книга добавлена в колл. " + listBooks.get(book.getId()));
        } else {
            System.out.println("id " + book.getId() + " книги уже занят. Введите другой id!");

        }
    }

    //метод возрата всех книг библиотеки.

    public Map<Integer, Book> getListBooks(Map<Integer, Book> listBooks) {

        return listBooks;

    }

    @Override
    public String toString() {

        return "listBooks=" + listBooks;
    }

    //удаление книги по id
    public void delBook(int id) {
        if (listBooks.containsKey(id)) {
            listBooks.remove(id);
        } else {
            System.out.println("Введите другой id, данного id не существует!");

        }
    }


}
