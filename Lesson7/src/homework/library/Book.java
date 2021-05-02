package homework.library;

public class Book {

    @Override
    public String toString() {
        return "title " + title;
    }

    private int id;
    String title;
    String genreId;//должен ссылаться на жанр по id в class Genre

    public Book(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
