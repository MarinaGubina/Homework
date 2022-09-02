package ProSky.course1.homework9;

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
}
