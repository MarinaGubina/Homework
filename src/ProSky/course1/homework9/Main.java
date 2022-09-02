package ProSky.course1.homework9;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Фёдор", "Достоевский");
        Book book1 = new Book("Преступление и наказание", author1, 2000);
        Author author2 = new Author("Джаннет", "Уоллс");
        Book book2 = new Book("Замок из стекла", author2, 2011);
        book2.setYearPublication(1999);
        Author author3 = new Author("Джаннет", "Уоллс");
        Book book3 = new Book("Замок из стекла", author3, 2011);
        System.out.println(book1);
        System.out.println(book3);
        System.out.println(book2.hashCode() == book3.hashCode());
        System.out.println(book2.equals(book3));
        System.out.println(book1.hashCode() == book3.hashCode());

    }
}


