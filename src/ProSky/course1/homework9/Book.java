package ProSky.course1.homework9;

import java.util.Objects;

public class Book {
    private String titleOfBook;
    private int yearPublication;
    Author author;

    public Book(String titleOfBook, Author author, int yearPublication){
        this.titleOfBook = titleOfBook;
        this.author = author;
        this.yearPublication = yearPublication;

    }
    public String getTitleOfBook() {
        return titleOfBook;
    }
    public int getYearPublication(){
        return yearPublication;
    }
    public Author getAuthor(){
        return author;
    }
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public String toString() {
        return "{ Название: " + titleOfBook + '\n' + author.toString() + '\n' +
                "Год публикации:" + yearPublication + "}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return titleOfBook.equals(book.titleOfBook) && author.equals(book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(titleOfBook, author);
    }
}
