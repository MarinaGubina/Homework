package ProSky.course1.homework9;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Фёдор", "Достоевский");
        Book book1 = new Book("Преступление и наказание", author1, 2000);
        Author author2 = new Author("Джаннет", "Уоллс");
        Book book2 = new Book("Замок из стекла", author2, 2011);
        book2.setYearPublication(1999);
        System.out.println(book1.getTitleOfBook() + " : " + author1.getAuthorName() + " " + author1.getAuthorLastName() + " : " + book1.getYearPublication());
        System.out.println(book2.getTitleOfBook() + " : " + author2.getAuthorName() + " " + author2.getAuthorLastName() + " : " + book2.getYearPublication());
    }
}


