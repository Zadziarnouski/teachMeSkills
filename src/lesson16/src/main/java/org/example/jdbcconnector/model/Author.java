package lesson16.src.main.java.org.example.jdbcconnector.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

public class Author extends BaseEntity {
    private String name;

    @Override
    public String toString() {
        return "Author{" +
                "id='" + id+ '\'' +
                ", name=" + name +
                '}';
    }
}
