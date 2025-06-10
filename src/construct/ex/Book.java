package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author + ", Page: " + page);
    }

    Book(String title, String author, int page) {
    this.title = title;
    this.author = author;
    this.page = page;
    }

    Book(String title, String author) {
        this(title, author, 100);
    }

    Book() {
        System.out.println("기본 생성자");
    }
}
