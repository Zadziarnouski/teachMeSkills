package org.example.jdbcconnector.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter


public class Genre extends BaseEntity {
    private String name;

    @Override
    public String toString() {
        return "Genre{" +
                "id='" + id + '\'' +
                ", name =" + name +
                '}';
    }
}
