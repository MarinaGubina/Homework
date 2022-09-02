package ProSky.course1.homework9;

import java.util.Objects;

public class Author {
    private String authorName;
    private String authorLastName;

    public Author(String authorName, String authorLastName){
        this.authorName = authorName;
        this.authorLastName = authorLastName;
    }
    public String getAuthorName(){
        return authorName;
    }

    public String getAuthorLastName(){
        return authorLastName;
    }

    @Override
    public String toString() {
        return   "Автор: " + authorName + " "+ authorLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorName.equals(author.authorName) && authorLastName.equals(author.authorLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorLastName);
    }
}
