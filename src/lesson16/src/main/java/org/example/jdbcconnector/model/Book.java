package lesson16.src.main.java.org.example.jdbcconnector.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

public class Book extends BaseEntity{
    private int idBook;
    private String tittle;
    private String author;
    private String genre;
    private int year;

    @Override
    public String toString() {
        return "Book{" +
                 "id=" + id +
                ", idBook=" + idBook +
                ", tittle='" + tittle + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", year=" + year +
                '}';
    }
}
